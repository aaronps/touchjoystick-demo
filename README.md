# Touch Joystick Demo

This is a demo for using [touchjoystick], it comes with
two branches:

* __master__ -> uses `git submodule` to import the library
* __[import-library]__ -> imports a generated `aar` library file

## Using submodule

Clone like this:

```
git clone --recursive https://github.com/aaronps/touchjoystick-demo
```

Then open the proyect and you are ready.

## Switching branches

**When** switching from master to [import-library] delete manually the
`touchjoystick` folder.

**After** switching from to master, run the command `git submodule update`.

In **any case** after switching branches is recommended to `git clean -Xid`,
otherwise weird errors may arise.

[touchjoystick]: https://github.com/aaronps/touchjoystick
[import-library]: ../../tree/import-library
