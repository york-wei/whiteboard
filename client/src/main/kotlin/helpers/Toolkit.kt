/*
 * Copyright (c) 2023 Avesta Barzegar, York Wei, Mikail Rahman, Edward Wang
 */

package cs346.whiteboard.client.helpers

import cs346.whiteboard.client.whiteboard.interaction.WhiteboardToolbarOptions

object Toolkit {
    var toolHolder = WhiteboardToolbarOptions.SELECT
    var isToolHeld = false

    var metaHolder = false
    var shiftHolder = false
}