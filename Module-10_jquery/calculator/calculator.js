$(function(){
    $("button").on("click", function() {
        let input1 = parseInt($('#input1').val());
        let input2 = parseInt($('#input2').val());
        let result;

        if (!isNaN(input1) && !isNaN(input2)) {
            let button_text = $(this).text();
            switch(button_text) {
                case 'Addition':
                    result = input1 + input2;
                    break;
                case 'Subtraction':
                    result = input1 - input2;
                    break;
                case 'Multiplication':
                    result = input1 * input2;
                    break;
                case 'Division':
                    result = input1 / input2;
                    break;
                case 'Modulo Division':
                    result = input1 % input2;
                    break;
                default:
                    result = 'Invalid Operation';
            }
            $('#output').val(result);
        } else {
            alert('Please provide valid inputs');
        }
    });
});
