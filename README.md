# 🐛 Bug Hunt - Learn the Bug to PR Workflow

A simple Java project with intentional bugs for practicing the GitHub contribution workflow.

## 🎯 Purpose

This project helps you learn:
- Finding and reporting bugs (Issues)
- Forking repositories
- Creating branches
- Fixing bugs and writing tests
- Submitting Pull Requests

## 🚀 Getting Started

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/bug-hunt-java.git
cd bug-hunt-java

# Compile
javac -d out src/*.java

# Run
java -cp out Main
```

## 📁 Project Structure

```
bug-hunt-java/
├── README.md
├── CONTRIBUTING.md
├── src/
│   ├── Main.java
│   ├── Calculator.java
│   ├── StringUtils.java
│   └── ArrayHelper.java
└── tests/
    └── TestRunner.java
```

## 🐛 Known Bug Count: 6

Each file contains bugs waiting to be discovered and fixed!

## 🔄 Contribution Workflow

1. **Find a Bug** - Run the code, read through it, or check the Issues tab
2. **Create an Issue** - Describe the bug you found
3. **Fork & Clone** - Get your own copy of the repo
4. **Create a Branch** - `git checkout -b fix/bug-description`
5. **Fix the Bug** - Make your changes
6. **Test** - Make sure your fix works
7. **Commit** - `git commit -m "Fix: description of fix"`
8. **Push** - `git push origin fix/bug-description`
9. **Open a PR** - Submit your changes for review

## 📜 License

Feel free to use for learning!
