## Compile with
```
$find * -name "*.java" > sources.txt
$javac @sources.txt
```

## Scenario File
The first line represents how many times the simulation runs and the number of times a wwather change is triggered.

Other lines reprensent:
```
 TYPE NAME LONGITUDE LATITUDE HEIGHT
```

## Weather generation
• RAIN
• FOG
• SUN
• SNOW