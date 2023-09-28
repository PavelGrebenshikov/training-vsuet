from controller import CalculatorController

def main():
    calculator = CalculatorController()
    calculator.run()
    calculator.display_history()

if __name__ == "__main__":
    main()