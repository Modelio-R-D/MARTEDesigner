/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << DataPool_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DataPoolAssociationEnd {
    public static final String STEREOTYPE_NAME = "DataPool_AssociationEnd";

    public static final String DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE = "DataPool_AssociationEnd_insertion";

    public static final String DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE = "DataPool_AssociationEnd_ordering";

    public static final String DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE = "DataPool_AssociationEnd_selection";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link DataPoolAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >> then instantiate a {@link DataPoolAssociationEnd} proxy.
     * 
     * @return a {@link DataPoolAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static DataPoolAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DataPoolAssociationEnd.STEREOTYPE_NAME);
        return DataPoolAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link DataPoolAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link DataPoolAssociationEnd} proxy or <i>null</i>.
     */
    public static DataPoolAssociationEnd instantiate(final AssociationEnd obj) {
        return DataPoolAssociationEnd.canInstantiate(obj) ? new DataPoolAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataPoolAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DataPool_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link DataPoolAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DataPoolAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (DataPoolAssociationEnd.canInstantiate(obj))
        	return new DataPoolAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("DataPoolAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DataPoolAssociationEnd other = (DataPoolAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'DataPool_AssociationEnd_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_AssociationEnd_insertion() {
        return this.elt.getTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_AssociationEnd_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_AssociationEnd_ordering() {
        return this.elt.getTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'DataPool_AssociationEnd_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDataPool_AssociationEnd_selection() {
        return this.elt.getTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    public AssociationEnd getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'DataPool_AssociationEnd_insertion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_AssociationEnd_insertion(final String value) {
        this.elt.putTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_AssociationEnd_ordering'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_AssociationEnd_ordering(final String value) {
        this.elt.putTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'DataPool_AssociationEnd_selection'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDataPool_AssociationEnd_selection(final String value) {
        this.elt.putTagValue(DataPoolAssociationEnd.MdaTypes.DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT, value);
    }

    protected DataPoolAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT;

        public static TagType DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT;

        public static TagType DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02644250-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ASSOCIATIONEND_ORDERING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644254-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ASSOCIATIONEND_INSERTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02644258-0ccf-11df-8525-001302895b2b");
            DATAPOOL_ASSOCIATIONEND_SELECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0264425c-0ccf-11df-8525-001302895b2b");
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
