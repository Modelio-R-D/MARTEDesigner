package org.modelio.module.marte.profile.datatypes.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class TupleType_DataType {
    protected DataType element;

    public TupleType_DataType() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDataType();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TUPLETYPE_DATATYPE);
        this.element.setName(MARTEResourceManager.getName("TupleType_DataType"));
    }

    public TupleType_DataType(DataType element) {
        this.element = element;
    }

    public DataType getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

}
