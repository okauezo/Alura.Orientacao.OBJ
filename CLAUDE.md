# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is an educational Java project from Alura (Brazilian online learning platform) focused on Object-Oriented Programming concepts. All class/variable names are in Portuguese.

## Build & Run

No Maven/Gradle — the project uses IntelliJ IDEA directly (JDK 25, output to `out/`).

To compile and run from the terminal:
```bash
# Compile a specific file (from repo root)
javac -d out screen.match/src/br/com/alura/screenmatch/principal/Main.java

# Run the main ScreenMatch app
java -cp out br.com.alura.screenmatch.principal.Main

# Run list demos
java -cp out br.com.alura.screenmatch.principal.PrincipalComListas
```

Each challenge package also has its own `Main.java` or `Principal.java` entry point that can be run independently.

## Architecture

### Main Application: `screen.match/src/br/com/alura/screenmatch/`

The ScreenMatch app is the primary structured package and demonstrates the full OOP pattern:

- **`modelos/`** — Domain model hierarchy:
  - `Titulo` (abstract base, implements `Comparable<Titulo>`) → `Filme`, `Serie`
  - `Episodio` implements `Classificavel`
  - `Classificavel` interface: single method `getClassificavel()`

- **`calculadora/`** — Utility classes using polymorphism:
  - `CalculadoraDeTempo` — accepts any `Titulo` subtype via `inclui(Titulo)`
  - `FiltroRecomendacao` — accepts any `Classificavel` via `Filtra(Classificavel)`

- **`principal/`** — Entry points demonstrating usage

### Challenge Packages: `screen.match/src/DesafiosAluraObj/` and `DesafisosAluraListas/`

Progressive exercises building OOP complexity:

| Package | Concepts |
|---|---|
| `Desafio1` | Basic class attributes, getters/setters |
| `Desafio2` | Encapsulation, calculations within classes |
| `Desafio3` | Inheritance, polymorphism (`Animal→Cachorro/Gato`) |
| `Desafio4` | Interfaces (`Calculavel`, `Vendavel`, `ConversaoFinanceira`) |
| `Spotify` | Abstract base class (`Audio→Musica/Podcast`) |
| `contaBancaria` | Simple inheritance |
| `imposto` | Interface `Tributavel`, polymorphic tax accumulator |
| `DesafisosAluraListas` | `ArrayList`, `Collections.sort()`, `Comparable`, `Comparator` |

### Key OOP Patterns in Use

- **Polymorphism via interfaces:** `Classificavel` and `Tributavel` let utility classes (`FiltroRecomendacao`, `CalculadoraImposto`) accept unrelated types
- **Natural ordering:** `Titulo` implements `Comparable<Titulo>` (sorts by `nome`)
- **Custom sorting:** `Comparator.comparing(Titulo::getAnoLancamento)` used in `PrincipalComListas`
- **Pattern matching:** `instanceof` with type binding (Java 16+) used in list exercises
