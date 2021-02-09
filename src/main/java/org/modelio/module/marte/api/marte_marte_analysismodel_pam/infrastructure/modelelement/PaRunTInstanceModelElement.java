/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.infrastructure.modelelement;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << PaRunTInstance_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class PaRunTInstanceModelElement {
    public static final String STEREOTYPE_NAME = "PaRunTInstance_ModelElement";

    public static final String PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE = "PaRunTInstance_ModelElement_host";

    public static final String PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE = "PaRunTInstance_ModelElement_instance";

    public static final String PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE = "PaRunTInstance_ModelElement_poolSize";

    public static final String PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE = "PaRunTInstance_ModelElement_throughput";

    public static final String PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE = "PaRunTInstance_ModelElement_unbddPool";

    public static final String PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE = "PaRunTInstance_ModelElement_utilization";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PaRunTInstanceModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaRunTInstanceModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >> then instantiate a {@link PaRunTInstanceModelElement} proxy.
     * 
     * @return a {@link PaRunTInstanceModelElement} proxy on the created {@link ModelElement}.
     */
    public static PaRunTInstanceModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaRunTInstanceModelElement.STEREOTYPE_NAME);
        return PaRunTInstanceModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PaRunTInstanceModelElement} proxy from a {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PaRunTInstanceModelElement} proxy or <i>null</i>.
     */
    public static PaRunTInstanceModelElement instantiate(final ModelElement obj) {
        return PaRunTInstanceModelElement.canInstantiate(obj) ? new PaRunTInstanceModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaRunTInstanceModelElement} proxy from a {@link ModelElement} stereotyped << PaRunTInstance_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PaRunTInstanceModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static PaRunTInstanceModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PaRunTInstanceModelElement.canInstantiate(obj))
        	return new PaRunTInstanceModelElement(obj);
        else
        	throw new IllegalArgumentException("PaRunTInstanceModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        PaRunTInstanceModelElement other = (PaRunTInstanceModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaRunTInstance_ModelElement_host() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_instance'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaRunTInstance_ModelElement_instance() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaRunTInstance_ModelElement_poolSize() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaRunTInstance_ModelElement_throughput() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaRunTInstance_ModelElement_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getPaRunTInstance_ModelElement_utilization() {
        return this.elt.getTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'PaRunTInstance_ModelElement_unbddPool'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isPaRunTInstance_ModelElement_unbddPool() {
        return this.elt.isTagged(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRunTInstance_ModelElement_host(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_instance'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRunTInstance_ModelElement_instance(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRunTInstance_ModelElement_poolSize(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRunTInstance_ModelElement_throughput(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'PaRunTInstance_ModelElement_unbddPool'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRunTInstance_ModelElement_unbddPool(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'PaRunTInstance_ModelElement_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setPaRunTInstance_ModelElement_utilization(final String value) {
        this.elt.putTagValue(PaRunTInstanceModelElement.MdaTypes.PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT, value);
    }

    protected PaRunTInstanceModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT;

        public static TagType PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT;

        public static TagType PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT;

        public static TagType PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT;

        public static TagType PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT;

        public static TagType PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d367ad-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367ae-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_UNBDDPOOL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367af-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_INSTANCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b0-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b1-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b2-0ccf-11df-8525-001302895b2b");
            PARUNTINSTANCE_MODELELEMENT_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b3-0ccf-11df-8525-001302895b2b");
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
