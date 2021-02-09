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
 * Proxy class to handle a {@link DataType} with << CollectionType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class CollectionTypeDataType {
    public static final String STEREOTYPE_NAME = "CollectionType_DataType";

    public static final String COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE = "CollectionType_DataType_collectionAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    protected final DataType elt;

    /**
     * Tells whether a {@link CollectionTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << CollectionType_DataType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CollectionTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << CollectionType_DataType >> then instantiate a {@link CollectionTypeDataType} proxy.
     * 
     * @return a {@link CollectionTypeDataType} proxy on the created {@link DataType}.
     */
    public static CollectionTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CollectionTypeDataType.STEREOTYPE_NAME);
        return CollectionTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link CollectionTypeDataType} proxy from a {@link DataType} stereotyped << CollectionType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link CollectionTypeDataType} proxy or <i>null</i>.
     */
    public static CollectionTypeDataType instantiate(final DataType obj) {
        return CollectionTypeDataType.canInstantiate(obj) ? new CollectionTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CollectionTypeDataType} proxy from a {@link DataType} stereotyped << CollectionType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link CollectionTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CollectionTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (CollectionTypeDataType.canInstantiate(obj))
        	return new CollectionTypeDataType(obj);
        else
        	throw new IllegalArgumentException("CollectionTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CollectionTypeDataType other = (CollectionTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CollectionType_DataType_collectionAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getCollectionType_DataType_collectionAttrib() {
        return this.elt.getTagValue(CollectionTypeDataType.MdaTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT);
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
     * Setter for string property 'CollectionType_DataType_collectionAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setCollectionType_DataType_collectionAttrib(final String value) {
        this.elt.putTagValue(CollectionTypeDataType.MdaTypes.COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT, value);
    }

    protected CollectionTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9efe2e1-0cce-11df-8525-001302895b2b");
            COLLECTIONTYPE_DATATYPE_COLLECTIONATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9efe2e5-0cce-11df-8525-001302895b2b");
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
