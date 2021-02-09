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
 * Proxy class to handle a {@link DataType} with << BoundedSubtype_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class BoundedSubtypeDataType {
    public static final String STEREOTYPE_NAME = "BoundedSubtype_DataType";

    public static final String BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE = "BoundedSubtype_DataType_baseType";

    public static final String BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE = "BoundedSubtype_DataType_isMaxOpen";

    public static final String BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE = "BoundedSubtype_DataType_isMinOpen";

    public static final String BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE = "BoundedSubtype_DataType_maxValue";

    public static final String BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE = "BoundedSubtype_DataType_minValue";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    protected final DataType elt;

    /**
     * Tells whether a {@link BoundedSubtypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << BoundedSubtype_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, BoundedSubtypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << BoundedSubtype_DataType >> then instantiate a {@link BoundedSubtypeDataType} proxy.
     * 
     * @return a {@link BoundedSubtypeDataType} proxy on the created {@link DataType}.
     */
    public static BoundedSubtypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, BoundedSubtypeDataType.STEREOTYPE_NAME);
        return BoundedSubtypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link BoundedSubtypeDataType} proxy from a {@link DataType} stereotyped << BoundedSubtype_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link BoundedSubtypeDataType} proxy or <i>null</i>.
     */
    public static BoundedSubtypeDataType instantiate(final DataType obj) {
        return BoundedSubtypeDataType.canInstantiate(obj) ? new BoundedSubtypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BoundedSubtypeDataType} proxy from a {@link DataType} stereotyped << BoundedSubtype_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link BoundedSubtypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static BoundedSubtypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (BoundedSubtypeDataType.canInstantiate(obj))
        	return new BoundedSubtypeDataType(obj);
        else
        	throw new IllegalArgumentException("BoundedSubtypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        BoundedSubtypeDataType other = (BoundedSubtypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'BoundedSubtype_DataType_baseType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getBoundedSubtype_DataType_baseType() {
        return this.elt.getTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'BoundedSubtype_DataType_maxValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getBoundedSubtype_DataType_maxValue() {
        return this.elt.getTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'BoundedSubtype_DataType_minValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getBoundedSubtype_DataType_minValue() {
        return this.elt.getTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT);
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
     * Getter for boolean property 'BoundedSubtype_DataType_isMaxOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isBoundedSubtype_DataType_isMaxOpen() {
        return this.elt.isTagged(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'BoundedSubtype_DataType_isMinOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isBoundedSubtype_DataType_isMinOpen() {
        return this.elt.isTagged(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'BoundedSubtype_DataType_baseType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setBoundedSubtype_DataType_baseType(final String value) {
        this.elt.putTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'BoundedSubtype_DataType_isMaxOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setBoundedSubtype_DataType_isMaxOpen(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'BoundedSubtype_DataType_isMinOpen'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setBoundedSubtype_DataType_isMinOpen(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'BoundedSubtype_DataType_maxValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setBoundedSubtype_DataType_maxValue(final String value) {
        this.elt.putTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'BoundedSubtype_DataType_minValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setBoundedSubtype_DataType_minValue(final String value) {
        this.elt.putTagValue(BoundedSubtypeDataType.MdaTypes.BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT, value);
    }

    protected BoundedSubtypeDataType(final DataType elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT;

        public static TagType BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT;

        public static TagType BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT;

        public static TagType BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT;

        public static TagType BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9ed8091-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_BASETYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed8095-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_MINVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed8099-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_MAXVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed809d-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_ISMINOPEN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed80a1-0cce-11df-8525-001302895b2b");
            BOUNDEDSUBTYPE_DATATYPE_ISMAXOPEN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed80a5-0cce-11df-8525-001302895b2b");
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
