# ComposeApp

ComposeApp is a Kotlin-based project that leverages Jetpack Compose for building modern, native UI. This project includes a custom Material theme with extended color palettes, typography, and spacing.

## Table of Contents

- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Theme Customization](#theme-customization)
  - [Colors](#colors)
  - [Typography](#typography)
  - [Spacing](#spacing)
- [Usage](#usage)

## Getting Started

## Project Structure

```kotlin
composeApp/
├── src/
│   ├── commonMain/
│   │   └── kotlin/
│   │       └── com/
│   │           └── kashif/
│   │               └── designsystem/
│   │                   ├── App.kt
│   │                   └── theme/
│   │                       ├── colors/
│   │                       ├── typography/
│   │                       └── spacing/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```
### Prerequisites

- [Android Studio](https://developer.android.com/studio) or [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Kotlin](https://kotlinlang.org/)
- [Gradle](https://gradle.org/)

### Installation

1. Clone the repository:
 
    git clone [https://github.com/Kashif-E/Custom-Design-System-Compose-Mutiplatform](https://github.com/Kashif-E/Custom-Design-System-Compose-Mutiplatform.git)
  
2. Open the project in Android Studio or IntelliJ IDEA.
3. Sync the project with Gradle files.

## Theme Customization

### Colors

The color palette is defined in `colors/Colors.kt`:

```kotlin
val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightPrimary = Purple500
val LightPrimaryVariant = Purple700
val LightSecondary = Teal200

val DarkPrimary = Purple200
val DarkPrimaryVariant = Purple700
val DarkSecondary = Teal200
```

### Typography

The typography is defined in `typography/Typography.kt`:

```kotlin
val AppTypography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)
```

### Spacing

The spacing is defined in `spacing/Spacing.kt`:

```kotlin
data class ExtendedSpacing (
    val xxs: Dp = 2.dp,
    val xs: Dp = 4.dp,
    val s: Dp = 8.dp,
    val m: Dp = 12.dp,
    val semiLargeSpacing: Dp = 14.dp,
    val l: Dp = 16.dp,
    val lHalf: Dp = 16.5.dp,
    val xl: Dp = 20.dp,
    val xxl: Dp = 24.dp,
    val iconSmall: Dp = 20.dp,
    val pillIcon: Dp = 15.dp
)
```

## Usage

To use the custom theme in your Compose UI, you can use the `MaterialTheme` composable:

```kotlin
MaterialTheme(
    colors = lightColors(
        primary = LightPrimary,
        primaryVariant = LightPrimaryVariant,
        secondary = LightSecondary
    ),
    typography = AppTypography,
    shapes = Shapes,
    content = content
)
```

Example usage in a composable function:

```kotlin
@Composable
fun CustomCard() {
    val colors = LocalAppColors.current
    val shapes = LocalAppShapes.current
    val spacing = LocalAppSpacing.current

    Card(
        backgroundColor = colors.surface,
        contentColor = colors.onSurface,
        shape = shapes.cardShape,
        modifier = Modifier
            .padding(spacing.m)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(spacing.l)
        ) {
            Text(
                text = "Card Title",
                color = colors.primary,
                modifier = Modifier.padding(bottom = spacing.s)
            )
            Text(
                text = "This is an example of a card using extended spacing, colors, and shapes.",
                color = colors.onSurface
            )
        }
    }
}
```

### Ending Note
Thank you for exploring this Sample! I hope this project helps you get started with Compose and inspires you to create beautiful, modern UIs. 

Happy coding! 🚀
