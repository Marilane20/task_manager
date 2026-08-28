# Mini Gestionnaire de Tâches (CLI)

Une application Java simple en ligne de commande pour gérer des tâches quotidiennes, conçue pour mettre en pratique les fondamentaux de la Programmation Orientée Objet (POO), la manipulation des Collections Java et la rigueur de versioning avec Git via les **Conventional Commits**.

---

## Fonctionnalités

- **Ajouter une tâche :** Crée une nouvelle tâche avec un identifiant auto-incrémenté et un titre.
- **Lister toutes les tâches :** Affiche l'ensemble des tâches enregistrées avec leur statut d'exécution.
- **Marquer comme terminée :** Met à jour le statut d'une tâche à l'aide de son identifiant (`id`).
- **Supprimer une tâche :** Supprime définitivement une tâche de la liste en mémoire.
- **Menu interactif sécurisé :** Boucle de navigation CLI avec validation des entrées utilisateur (`Scanner`).

---

## Stack Technique & Prérequis

- **Langage :** Java 21
- **Outil de build :** Maven
- **Structure de données :** Stockage en mémoire avec `java.util.List` (`ArrayList`) et opérations via l'API Stream.

---

## Structure du Projet

```text
task_manager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       ├── Main.java         # Point d'entrée & boucle du menu console
│   │   │       ├── Task.java         # Modèle de tâche (id, title, completed)
│   │   │       └── TaskManager.java  # Logique métier & gestion de la collection
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md
```

---

## Compilation et Exécution

### Prérequis
- JDK 21 installé et configuré.
- Maven configuré (ou exécuter directement depuis IntelliJ IDEA).

### Compiler le projet avec Maven
```bash
mvn clean package
```

### Lancer l'application
Depuis l'IDE :
Exécutez directement la classe `Main.java`.

Depuis le terminal :
```bash
java -cp target/classes org.example.Main
```

---

## Exemple d'Utilisation

```text
************************ WELCOME TO TASK MANAGER BY MARILANE ************************

Choose your option:
1 - Add a task
2 - List all tasks
3 - Mark a task as completed
4 - Delete a task
5 - Exit programme

Enter your choice: 1
Enter the title of your task: Terminer l'introduction a Spring Boot
Task added successfully!

Enter your choice: 2

--- Your Tasks ---
Task [ID: 1 | Title: Terminer l'introduction a Spring Boot | Completed: false]

Enter your choice: 3
Enter the ID of the task to mark as completed: 1
Task marked as completed.

Enter your choice: 5
Exiting application. Goodbye!
```

---

## Démonstration (Capture d'écran)

*(Place ta capture d'écran ici sous le nom `screenshot.png` à la racine)*

```text
![Capture CLI](screenshot.png)
```

---

## Historique des Commits (Conventional Commits)

Le dépôt suit la convention standardisée :
- `feat: add Task model class with auto-increment ID`
- `feat: implement TaskManager with in-memory collection and Stream operations`
- `feat: create interactive CLI loop and scanner input handling in Main`
- `refactor: improve user input validation and error feedback`
- `docs: add comprehensive README with execution instructions`