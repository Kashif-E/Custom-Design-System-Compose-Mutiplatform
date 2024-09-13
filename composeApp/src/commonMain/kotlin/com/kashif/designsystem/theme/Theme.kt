package com.kashif.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import com.kashif.designsystem.theme.colors.DarkBlue50
import com.kashif.designsystem.theme.colors.LocalAppColors
import com.kashif.designsystem.theme.colors.lightExtendedColors
import com.kashif.designsystem.theme.shapes.LocalAppShapes
import com.kashif.designsystem.theme.shapes.appShapes
import com.kashif.designsystem.theme.spacing.ExtendedSpacing
import com.kashif.designsystem.theme.spacing.LocalAppSpacing

@Composable
fun getColorPallete(darkTheme: Boolean = isSystemInDarkTheme()): Colors {
    return if (darkTheme) {
        Colors(
            primary = LocalAppColors.current.primary,
            onPrimary = LocalAppColors.current.onPrimary,
            surface = LocalAppColors.current.surface,
            onSurface = LocalAppColors.current.onSurface,
            background = LocalAppColors.current.background,
            onBackground = LocalAppColors.current.onBackground,
            secondary = LocalAppColors.current.secondary,
            onSecondary = LocalAppColors.current.onSecondary,
            secondaryVariant = LocalAppColors.current.secondaryVariant,
            error = LocalAppColors.current.error,
            onError = LocalAppColors.current.onError,
            primaryVariant = LocalAppColors.current.primaryVariant,
            isLight = false
        )
    } else {
        Colors(
                primary = LocalAppColors.current.primary,
                onPrimary = LocalAppColors.current.onPrimary,
                surface = LocalAppColors.current.surface,
                onSurface = LocalAppColors.current.onSurface,
                background = LocalAppColors.current.background,
                onBackground = LocalAppColors.current.onBackground,
                secondary = LocalAppColors.current.secondary,
                onSecondary = LocalAppColors.current.onSecondary,
                secondaryVariant = LocalAppColors.current.secondaryVariant,
                error = LocalAppColors.current.error,
                onError = LocalAppColors.current.onError,
                primaryVariant = LocalAppColors.current.primaryVariant,
            isLight = true
        )
    }
}

/**
 *  extension property for DarkBlue color
 */
val Colors.warning: Color
    @Composable
    get() = if (isSystemInDarkTheme()) DarkBlue50 else DarkBlue

/**
 * App custom theme for the entire Compose hierarchy.
 * @param darkTheme Whether to apply the dark theme (true) or the light theme (false). Default value is determined by the system's dark theme setting.
 * @param content The content that should be displayed within the theme.
 */
@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {

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
}
