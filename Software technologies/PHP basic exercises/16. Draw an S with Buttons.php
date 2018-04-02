
<?php
startMiddleEndRow();
leftAlignedButtons();
startMiddleEndRow();
rightAlignedButtons();
startMiddleEndRow();
function startMiddleEndRow()
{
    for ($button = 0; $button < 5; $button++) {
        echo "<button style='background-color:blue'>1</button>";
    }
    echo "<br>";
}
function rightAlignedButtons()
{
    for ($rows = 0; $rows < 3; $rows++) {
        for ($button = 0; $button < 4; $button++) {
            echo "<button >0</button>";
        }
        echo "<button style='background-color:blue'>1</button>";
        echo "<br>";
    }

}
function leftAlignedButtons()
{

    for ($rows = 0; $rows < 3; $rows++) {
        echo "<button style='background-color:blue'>1</button>";
        for ($button = 0; $button < 4; $button++) {
            echo "<button >0</button>";
        }
        echo "<br>";
    }

}
?>
