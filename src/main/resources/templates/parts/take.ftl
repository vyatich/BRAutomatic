<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Потвержение операции</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/admin/town/delete" method="post">
                <div class="modal-body">
                    <div class="form-group">
                        <p>Вы действительно хотите удалить город? После подтверждения отмена операции будет невозможна!</p>
                    </div>
                </div>
                <div class="modal-footer">
                    <input id="id" name="id" type="hidden"/>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Нет</button>
                    <button type="submit" class="btn btn-primary">Да</button>
                </div>
            </form>
        </div>
    </div>
</div>