const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
    // anular o submit
    event.preventDefault();

    // declaração de variável
    let nome = document.querySelector('#nome').value;

    // exibe a caixa de diálogo
    alert(nome);

    // reseta o formulário após o submit
    form.reset();
});