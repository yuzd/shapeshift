/*
 * Copyright KRUD 2022
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package dev.krud.shapeshift.examples.kotlin

import dev.krud.shapeshift.ShapeShiftBuilder

/**
 * This example shows how to use the more advanced features of the ShapeShift
 */
fun main() {
    // Initialize ShapeShift with the default configuration
    val shapeShift = ShapeShiftBuilder()
        .build()
    // Initialize a AdvancedEntity
    val advancedEntity = AdvancedEntity(
        name = "Test",
        firstChild = AdvancedChildEntity("First Child"),
        secondChild = AdvancedChildEntity("Second Child"),
    )
    // Map the AdvancedEntity to a AdvancedEntityDisplay using ShapeShift
    val advancedEntityDisplay = shapeShift.map<AdvancedEntityDisplay>(advancedEntity)
    println("AdvancedEntityDisplay: $advancedEntityDisplay")

    // Map the AdvancedEntity to a ReducedAdvancedEntityDisplay using ShapeShift
    val reducedAdvancedEntityDisplay = shapeShift.map<ReducedAdvancedEntityDisplay>(advancedEntity)
    println("ReducedAdvancedEntityDisplay: $reducedAdvancedEntityDisplay")

}
