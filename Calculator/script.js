let input = document.getElementById('display-value');
let buttons = document.querySelectorAll('button');
let string = "";
let arr = Array.from(buttons);

function evaluateExpression(expression) {
    try {
        return new Function('return ' + expression)();
    } catch (error) {
        return 'Error';
    }
}

arr.forEach(function (button) {
    button.addEventListener('click', function (e) {
        if (e.target.innerHTML === '=') {
            if (string.length > 0) {
                string = evaluateExpression(string);
                input.value = string;
            } else {
                input.value = string;
            }
        } else if (e.target.innerHTML === 'AC') {
            string = "";
            input.value = string;
        } else if (e.target.innerHTML === 'DEL') {
            string = string.substring(0, string.length - 1);
            input.value = string;
        } else {
            string += e.target.innerHTML;
            input.value = string;
        } 
    });
});
