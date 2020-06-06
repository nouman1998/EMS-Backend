var fetch = require("node-fetch");

let requestOptions = {
	method: "GET",
	redirect: "follow",
};

const getemployee = (args) =>
	fetch("http://localhost:3000/employees/" + args.id, requestOptions)
		.then((response) => response.text())
		.then((result) => JSON.parse(result));

const getemployees = (args) =>
	fetch("http://localhost:3000/employees", requestOptions)
		.then((response) => response.text())
		.then((result) => JSON.parse(result));

let addemployee = ({ id, did, userid, jobcode, resume, joiningdate }) => {
	var raw = JSON.stringify({
		id,
		did,
		userid,
		jobcode,
		resume,
		joiningdate,
	});

	let requestOptions = {
		method: "POST",
		headers: { "Content-Type": "application/json" },
		body: raw,
		redirect: "follow",
	};

	return fetch("http://localhost:3000/employees", requestOptions)
		.then((response) => response.text())
		.then((result) => JSON.parse(result));
};

module.exports = { addemployee, getemployee, getemployees };
