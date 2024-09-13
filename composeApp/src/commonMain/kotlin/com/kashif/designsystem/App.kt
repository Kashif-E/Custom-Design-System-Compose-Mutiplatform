package com.kashif.designsystem

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kashif.designsystem.theme.AppTheme
import com.kashif.designsystem.theme.colors.LocalAppColors
import com.kashif.designsystem.theme.shapes.LocalAppShapes
import com.kashif.designsystem.theme.spacing.LocalAppSpacing
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
   AppTheme {
       CustomCard()
   }
}

@Composable
fun CustomCard() {
    // Store the local values in variables
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