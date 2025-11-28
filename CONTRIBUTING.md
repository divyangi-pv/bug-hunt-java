# Contributing to Bug Hunt Java

Thank you for wanting to contribute! This guide will walk you through the process.

## 🔍 Step 1: Find a Bug

- Run the program and check the output
- Read through the code carefully
- Check the Issues tab for reported bugs

## 📝 Step 2: Create an Issue

Before fixing, create an issue describing:
- **Title**: Short description (e.g., "Calculator subtract returns wrong result")
- **Description**: What's wrong and what should happen
- **Steps to reproduce**: How to see the bug
- **Expected vs Actual**: What you expected vs what happened

Example:
```
Title: Factorial function returns 0

Description:
The factorial method in Calculator.java always returns 0.

Steps to reproduce:
1. Create Calculator instance
2. Call calc.factorial(5)
3. Result is 0 instead of 120

Expected: 120
Actual: 0
```

## 🍴 Step 3: Fork the Repository

1. Click "Fork" button on GitHub
2. Clone your fork:
   ```bash
   git clone https://github.com/YOUR_USERNAME/bug-hunt-java.git
   ```

## 🌿 Step 4: Create a Branch

```bash
git checkout -b fix/issue-number-description
# Example: git checkout -b fix/1-factorial-returns-zero
```

## 🔧 Step 5: Fix the Bug

- Make minimal changes to fix the issue
- Add comments explaining your fix
- Test your changes

## ✅ Step 6: Test Your Fix

```bash
javac -d out src/*.java
java -cp out Main
```

## 💾 Step 7: Commit Changes

```bash
git add .
git commit -m "Fix: Brief description of what you fixed

- More details if needed
- Closes #issue-number"
```

## 🚀 Step 8: Push & Create PR

```bash
git push origin your-branch-name
```

Then on GitHub:
1. Click "Compare & pull request"
2. Fill in the PR template
3. Reference the issue: "Fixes #1"
4. Submit!

## 📋 PR Checklist

- [ ] Code compiles without errors
- [ ] Bug is actually fixed
- [ ] No new bugs introduced
- [ ] Commit message is clear
- [ ] PR references the issue

## 🎉 That's it!

Wait for review, make any requested changes, and celebrate when merged!
