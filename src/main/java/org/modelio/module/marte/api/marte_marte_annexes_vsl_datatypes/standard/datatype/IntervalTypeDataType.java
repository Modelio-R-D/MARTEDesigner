/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << IntervalType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class IntervalTypeDataType {
    public static final String STEREOTYPE_NAME = "IntervalType_DataType";

    public static final String INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE = "IntervalType_DataType_intervalAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    protected final DataType elt;

    /**
     * Tells whether a {@link IntervalTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << IntervalType_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, IntervalTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << IntervalType_DataType >> then instantiate a {@link IntervalTypeDataType} proxy.
     * 
     * @return a {@link IntervalTypeDataType} proxy on the created {@link DataType}.
     */
    public static IntervalTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, IntervalTypeDataType.STEREOTYPE_NAME);
        return IntervalTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link IntervalTypeDataType} proxy from a {@link DataType} stereotyped << IntervalType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link IntervalTypeDataType} proxy or <i>null</i>.
     */
    public static IntervalTypeDataType instantiate(final DataType obj) {
        return IntervalTypeDataType.canInstantiate(obj) ? new IntervalTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntervalTypeDataType} proxy from a {@link DataType} stereotyped << IntervalType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link IntervalTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static IntervalTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (IntervalTypeDataType.canInstantiate(obj))
        	return new IntervalTypeDataType(obj);
        else
        	throw new IllegalArgumentException("IntervalTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        IntervalTypeDataType other = (IntervalTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'IntervalType_DataType_intervalAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getIntervalType_DataType_intervalAttrib() {
        return this.elt.getTagValue(IntervalTypeDataType.MdaTypes.INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'IntervalType_DataType_intervalAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setIntervalType_DataType_intervalAttrib(final String value) {
        this.elt.putTagValue(IntervalTypeDataType.MdaTypes.INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT, value);
    }

    protected IntervalTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9ed80a9-0cce-11df-8525-001302895b2b");
            INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed80ad-0cce-11df-8525-001302895b2b");
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
