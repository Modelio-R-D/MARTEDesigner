/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << DataPool_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DataPoolAttribute {
    public static final String STEREOTYPE_NAME = "DataPool_Attribute";

    public static final String DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE = "DataPool_Attribute_insertion";

    public static final String DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE = "DataPool_Attribute_ordering";

    public static final String DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE = "DataPool_Attribute_selection";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    protected final Attribute elt;

    /**
     * Tells whether a {@link DataPoolAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << DataPool_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << DataPool_Attribute >> then instantiate a {@link DataPoolAttribute} proxy.
     * 
     * @return a {@link DataPoolAttribute} proxy on the created {@link Attribute}.
     */
    public static DataPoolAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAttribute.STEREOTYPE_NAME);
        return DataPoolAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolAttribute} proxy from a {@link Attribute} stereotyped << DataPool_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link DataPoolAttribute} proxy or <i>null</i>.
     */
    public static DataPoolAttribute instantiate(final Attribute obj) {
        return DataPoolAttribute.canInstantiate(obj) ? new DataPoolAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPoolAttribute} proxy from a {@link Attribute} stereotyped << DataPool_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link DataPoolAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DataPoolAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (DataPoolAttribute.canInstantiate(obj))
        	return new DataPoolAttribute(obj);
        else
        	throw new IllegalArgumentException("DataPoolAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DataPoolAttribute other = (DataPoolAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DataPool_Attribute_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_Attribute_insertion() {
        return this.elt.getTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_Attribute_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_Attribute_ordering() {
        return this.elt.getTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_Attribute_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_Attribute_selection() {
        return this.elt.getTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    public Attribute getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'DataPool_Attribute_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_Attribute_insertion(final String value) {
        this.elt.putTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_Attribute_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_Attribute_ordering(final String value) {
        this.elt.putTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_Attribute_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_Attribute_selection(final String value) {
        this.elt.putTagValue(DataPoolAttribute.MdaTypes.DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT, value);
    }

    protected DataPoolAttribute(final Attribute elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT;

        public static TagType DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT;

        public static TagType DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02644252-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ATTRIBUTE_ORDERING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644256-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ATTRIBUTE_INSERTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264425a-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ATTRIBUTE_SELECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264425e-0ccf-11df-8525-001302895b2b");
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
