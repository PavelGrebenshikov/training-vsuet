from models import CalculatorModel
from views import CalculatorView

class CalculatorController:

    def __init__(self):
        self.model = CalculatorModel()
        self.view = CalculatorView()

    def run(self):
        express = self.view.get_user_input()
        result = self.model.calculate_expression(express)
        self.view.display_result(result)

        save_path = self.view.save_history()
        if save_path:
            self.model.save_history(save_path)
        else:
            self.model.save_history("history.log")

    def display_history(self):
        history = self.model.get_history()
        print("История расчетов:")
        for i, (express, result) in enumerate(history):
            print(f"{i+1}. {express} = {result}")