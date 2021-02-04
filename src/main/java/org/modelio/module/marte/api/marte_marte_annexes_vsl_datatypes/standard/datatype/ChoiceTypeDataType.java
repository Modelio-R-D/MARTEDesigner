/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << ChoiceType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7b933719-df0d-4f02-b7e6-6db8782870cb")
public class ChoiceTypeDataType {
    @objid ("b316c4f5-5a4d-446f-ae11-6e04aee163f0")
    public static final String STEREOTYPE_NAME = "ChoiceType_DataType";

    @objid ("0a74f2f1-a28f-47af-a60b-88abc1330101")
    public static final String CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE = "ChoiceType_DataType_choiceAttrib";

    @objid ("429960b2-0413-482a-8720-005a856355da")
    public static final String CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE = "ChoiceType_DataType_defaultAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("30eb54de-15d1-466f-9ac1-48c468a6c6b3")
    protected final DataType elt;

    /**
     * Tells whether a {@link ChoiceTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ChoiceType_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d447ade6-fc1a-4ea4-8f29-e376b1834c28")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ChoiceTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << ChoiceType_DataType >> then instantiate a {@link ChoiceTypeDataType} proxy.
     * 
     * @return a {@link ChoiceTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("0f20c0f9-8728-41e0-b62f-4e802b41f51a")
    public static ChoiceTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ChoiceTypeDataType.STEREOTYPE_NAME);
        return ChoiceTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link ChoiceTypeDataType} proxy from a {@link DataType} stereotyped << ChoiceType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link ChoiceTypeDataType} proxy or <i>null</i>.
     */
    @objid ("6e30df83-109b-46c7-af6c-7a3195f03150")
    public static ChoiceTypeDataType instantiate(final DataType obj) {
        return ChoiceTypeDataType.canInstantiate(obj) ? new ChoiceTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ChoiceTypeDataType} proxy from a {@link DataType} stereotyped << ChoiceType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link ChoiceTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("26b14331-d26e-4ef2-abed-3945dd5b7a6d")
    public static ChoiceTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (ChoiceTypeDataType.canInstantiate(obj))
        	return new ChoiceTypeDataType(obj);
        else
        	throw new IllegalArgumentException("ChoiceTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("061b531b-44f6-4464-96c1-344a3f0b6aaf")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ChoiceTypeDataType other = (ChoiceTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'ChoiceType_DataType_choiceAttrib'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2f7ed54a-c4a8-4c3c-b7b9-947955eb92c8")
    public List<String> getChoiceType_DataType_choiceAttrib() {
        return this.elt.getTagValues(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ChoiceType_DataType_defaultAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a425db8-e1b1-4352-8b98-3dc2627c85d5")
    public String getChoiceType_DataType_defaultAttrib() {
        return this.elt.getTagValue(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("0920256e-73cf-40b8-af66-4d9a9f1ce72f")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("ea7a846f-fbbf-4778-a77b-34d7bab7ff18")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'ChoiceType_DataType_choiceAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9e0047d-b0d5-4e68-9e39-cfa4f1147572")
    public void setChoiceType_DataType_choiceAttrib(final List<String> values) {
        this.elt.putTagValues(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'ChoiceType_DataType_defaultAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76f92570-9ce7-4c0a-92a0-52d80832a15f")
    public void setChoiceType_DataType_defaultAttrib(final String value) {
        this.elt.putTagValue(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT, value);
    }

    @objid ("fe4e1487-3835-4a9f-b9eb-86d1523c0c6d")
    protected ChoiceTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("6dd29edc-693d-4ea6-a676-d9b621eebd99")
    public static final class MdaTypes {
        @objid ("d833c553-d6ce-4dc3-8506-4be936b8bf62")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1d4097d7-a7ae-40e5-ae4e-3adf219edfe2")
        public static TagType CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT;

        @objid ("898a9849-8fe3-44bc-b63a-161f57f75081")
        public static TagType CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT;

        @objid ("32c069bf-17f1-410d-ae58-3803bac9409a")
        private static Stereotype MDAASSOCDEP;

        @objid ("fe557689-276f-49d2-b893-f9ae39723dce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9946b384-f176-4b47-b471-7760b7ba9642")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9efe2ed-0cce-11df-8525-001302895b2b");
            CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9efe2f1-0cce-11df-8525-001302895b2b");
            CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9efe2f5-0cce-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
