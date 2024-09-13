# Custom Design system Jetpack/Multiplatform Compose

ComposeApp is a Kotlin-based project that leverages Jetpack/Multiplatform Compose for building modern, native UI. This project includes a custom Material theme with extended color palettes, typography, and spacing.

## Table of Contents

- [Getting Started](#getting-started)
- [Theme Customization](#theme-customization)
  - [Colors](#colors)
  - [Typography](#typography)
  - [Spacing](#spacing)
- [Usage](#usage)

## Getting Started

To get started with this project, follow the instructions below.

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
@Immutable
data class ExtendedColors(
    val primaryVariantLight: Color,
    val primaryVariantLightBG: Color,
    val errorLight: Color,
    val primaryLight: Color,
    val primaryLightBG: Color,
    val lightGreenBG1: Color,
    val primaryLightBG2: Color,
    val neutralBlue: Color,
    val neutralWhite: Color,
    val colorWhiteTransparent: Color,
    val greyLight: Color,
    val grey: Color,
    val greyMid: Color,
    val fieldPlaceHolderText: Color,
    val greyDark: Color,
    val greyBg: Color,
    val greyDarkText: Color,
    val warning: Color,
    val warningLight: Color,
    val primaryDark: Color,
    val youtube: Color,
    val secondarySurface: Color,
    val productViewBG: Color,
    val primary: Color,
    val  primaryVariant : Color,
    val secondary : Color,
    val secondaryVariant : Color,
    val background : Color,
    val backgroundTwo : Color,
    val surface : Color,
    val onPrimary : Color,
    val onSecondary : Color,
    val onBackground : Color,
    val onSurface : Color,
    val error : Color,
    val onError : Color,
    val toastBackground : Color,
    val toastText : Color
)
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

To use the custom theme in your Compose UI, you can use the `MaterialTheme` composable with `CompositionLocalProvider` to provide the custom theme values.:

```kotlin
 // CompositionLocalProvider is used to provide custom theme values to the Compose hierarchy.
CompositionLocalProvider(
    // Provide the extended colors based on the darkTheme parameter.
    LocalAppColors provides lightExtendedColors,
    // Provide the custom shapes defined by appShapes.
    LocalAppShapes provides appShapes,
    // Provide the custom spacing values.
    LocalAppSpacing provides ExtendedSpacing(),

    ) {
    // Apply the MaterialTheme with the custom typography and the content provided in the composable.
    MaterialTheme(
        typography = Type.typography,
        content = content,
        colors = getColorPallete(darkTheme)
    )
}
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
