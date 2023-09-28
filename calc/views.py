class CalculatorView:
    
    def get_user_input(self):
        return input("Введите выражение для расчета: ")

    def display_result(self, result):
        print("Результат: ", result)

    def save_history(self):
        return input("Введите имя и путь для сохранения файла или оставьте поле пустым для сохранения в текущей папке: ")