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
public class ChoiceTypeDataType {
    public static final String STEREOTYPE_NAME = "ChoiceType_DataType";

    public static final String CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE = "ChoiceType_DataType_choiceAttrib";

    public static final String CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE = "ChoiceType_DataType_defaultAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    protected final DataType elt;

    /**
     * Tells whether a {@link ChoiceTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << ChoiceType_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ChoiceTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << ChoiceType_DataType >> then instantiate a {@link ChoiceTypeDataType} proxy.
     * 
     * @return a {@link ChoiceTypeDataType} proxy on the created {@link DataType}.
     */
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
    public static ChoiceTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (ChoiceTypeDataType.canInstantiate(obj))
        	return new ChoiceTypeDataType(obj);
        else
        	throw new IllegalArgumentException("ChoiceTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public List<String> getChoiceType_DataType_choiceAttrib() {
        return this.elt.getTagValues(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ChoiceType_DataType_defaultAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getChoiceType_DataType_defaultAttrib() {
        return this.elt.getTagValue(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    public DataType getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'ChoiceType_DataType_choiceAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setChoiceType_DataType_choiceAttrib(final List<String> values) {
        this.elt.putTagValues(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'ChoiceType_DataType_defaultAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setChoiceType_DataType_defaultAttrib(final String value) {
        this.elt.putTagValue(ChoiceTypeDataType.MdaTypes.CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT, value);
    }

    protected ChoiceTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CHOICETYPE_DATATYPE_CHOICEATTRIB_TAGTYPE_ELT;

        public static TagType CHOICETYPE_DATATYPE_DEFAULTATTRIB_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
