class Parent extends React.Component {
  constructor(props) {
    super(props);
    console.log("1.constructor initiallizing the state");
    this.state = {
      name: "miller",
    };
  }
  shouldComponentUpdate() {
    console.log("3.component should update");
    return true;
  }
  updateState = () => {
    console.log("at updating phase");
    this.setState({
      name: "john",
    });
  };
  render() {
    console.log("2.render the state");
    return (
      <div>
        <h1>Hello Mr...{this.state.name}</h1>
        <button onClick={this.uodateState}>Change</button>
      </div>
    );
  }
}
