/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype.TupleTypeDataType;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << NfpType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class NfpTypeDataType extends TupleTypeDataType {
    public static final String STEREOTYPE_NAME = "NfpType_DataType";

    public static final String NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE = "NfpType_DataType_exprAttrib";

    public static final String NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE = "NfpType_DataType_unitAttrib";

    public static final String NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE = "NfpType_DataType_valueAttrib";

    /**
     * Tells whether a {@link NfpTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << NfpType_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, NfpTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << NfpType_DataType >> then instantiate a {@link NfpTypeDataType} proxy.
     * 
     * @return a {@link NfpTypeDataType} proxy on the created {@link DataType}.
     */
    public static NfpTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, NfpTypeDataType.STEREOTYPE_NAME);
        return NfpTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link NfpTypeDataType} proxy from a {@link DataType} stereotyped << NfpType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link NfpTypeDataType} proxy or <i>null</i>.
     */
    public static NfpTypeDataType instantiate(final DataType obj) {
        return NfpTypeDataType.canInstantiate(obj) ? new NfpTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NfpTypeDataType} proxy from a {@link DataType} stereotyped << NfpType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link NfpTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NfpTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (NfpTypeDataType.canInstantiate(obj))
        	return new NfpTypeDataType(obj);
        else
        	throw new IllegalArgumentException("NfpTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NfpTypeDataType other = (NfpTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'NfpType_DataType_exprAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNfpType_DataType_exprAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NfpType_DataType_unitAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNfpType_DataType_unitAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'NfpType_DataType_valueAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getNfpType_DataType_valueAttrib() {
        return this.elt.getTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'NfpType_DataType_exprAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNfpType_DataType_exprAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NfpType_DataType_unitAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNfpType_DataType_unitAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'NfpType_DataType_valueAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setNfpType_DataType_valueAttrib(final String value) {
        this.elt.putTagValue(NfpTypeDataType.MdaTypes.NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT, value);
    }

    protected NfpTypeDataType(final DataType elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT;

        public static TagType NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT;

        public static TagType NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9908614-0cce-11df-8525-001302895b2b");
            NFPTYPE_DATATYPE_VALUEATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9908618-0cce-11df-8525-001302895b2b");
            NFPTYPE_DATATYPE_UNITATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d990861c-0cce-11df-8525-001302895b2b");
            NFPTYPE_DATATYPE_EXPRATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9908620-0cce-11df-8525-001302895b2b");
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
