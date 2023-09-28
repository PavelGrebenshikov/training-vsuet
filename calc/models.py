class CalculatorModel:

    def __init__(self):
        self.history = []

    def calculate_expression(self, express):
        try:
            result = eval(express)
            self.history.append((express, result))
            return result
        except:
            return "Ошибка: некорректное выражение"

    def get_history(self):
        return self.history

    def save_history(self, file_path):
        with open(file_path, 'a') as file:
            for express, result in self.history:
                file.write(f"{express} = {result}\n")