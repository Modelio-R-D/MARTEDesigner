/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << PaLogicalResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PaLogicalResourceAssociationEnd extends ResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "PaLogicalResource_AssociationEnd";

    public static final String PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE = "PaLogicalResource_AssociationEnd_poolSize";

    public static final String PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE = "PaLogicalResource_AssociationEnd_throughput";

    public static final String PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE = "PaLogicalResource_AssociationEnd_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >> then instantiate a {@link PaLogicalResourceAssociationEnd} proxy.
     * 
     * @return a {@link PaLogicalResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static PaLogicalResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAssociationEnd.STEREOTYPE_NAME);
        return PaLogicalResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link PaLogicalResourceAssociationEnd} proxy or <i>null</i>.
     */
    public static PaLogicalResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return PaLogicalResourceAssociationEnd.canInstantiate(obj) ? new PaLogicalResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << PaLogicalResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link PaLogicalResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PaLogicalResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (PaLogicalResourceAssociationEnd.canInstantiate(obj))
        	return new PaLogicalResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PaLogicalResourceAssociationEnd other = (PaLogicalResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_AssociationEnd_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_AssociationEnd_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_AssociationEnd_throughput() {
        return this.elt.getTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaLogicalResource_AssociationEnd_utilization() {
        return this.elt.getTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_AssociationEnd_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_AssociationEnd_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_AssociationEnd_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_AssociationEnd_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_AssociationEnd_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaLogicalResource_AssociationEnd_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociationEnd.MdaTypes.PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT, value);
    }

    protected PaLogicalResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT;

        public static TagType PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10552-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ASSOCIATIONEND_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d10559-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ASSOCIATIONEND_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d10560-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_ASSOCIATIONEND_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a6-0ccf-11df-8525-001302895b2b");
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
