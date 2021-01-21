/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.executionspecification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.executionspecification.GrServiceExecutionSpecification;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ExecutionSpecification} with << SwAccessService_ExecutionSpecification >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5bccf67f-1292-48dc-aff7-c03091312009")
public class SwAccessServiceExecutionSpecification extends GrServiceExecutionSpecification {
    @objid ("21834103-51e4-44f3-acc5-a6889121d1c3")
    public static final String STEREOTYPE_NAME = "SwAccessService_ExecutionSpecification";

    @objid ("62054de7-43e2-4760-b3e4-f67485b5ee36")
    public static final String SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_ExecutionSpecification_accessedElement";

    @objid ("45bb522e-8e5a-4a06-8404-6f9cef7743ba")
    public static final String SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER_TAGTYPE = "SwAccessService_ExecutionSpecification_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceExecutionSpecification proxy} can be instantiated from a {@link MObject} checking it is a {@link ExecutionSpecification} stereotyped << SwAccessService_ExecutionSpecification >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("92474c40-f6fc-426d-b470-0987c87cf236")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ExecutionSpecification) && ((ExecutionSpecification) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceExecutionSpecification.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ExecutionSpecification} stereotyped << SwAccessService_ExecutionSpecification >> then instantiate a {@link SwAccessServiceExecutionSpecification} proxy.
     * 
     * @return a {@link SwAccessServiceExecutionSpecification} proxy on the created {@link ExecutionSpecification}.
     */
    @objid ("62183137-7aa0-4767-9acc-3aff0870dbd9")
    public static SwAccessServiceExecutionSpecification create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ExecutionSpecification");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceExecutionSpecification.STEREOTYPE_NAME);
        return SwAccessServiceExecutionSpecification.instantiate((ExecutionSpecification)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << SwAccessService_ExecutionSpecification >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ExecutionSpecification
     * @return a {@link SwAccessServiceExecutionSpecification} proxy or <i>null</i>.
     */
    @objid ("8ccf77e3-b52a-4d84-9404-cdfc550227eb")
    public static SwAccessServiceExecutionSpecification instantiate(final ExecutionSpecification obj) {
        return SwAccessServiceExecutionSpecification.canInstantiate(obj) ? new SwAccessServiceExecutionSpecification(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceExecutionSpecification} proxy from a {@link ExecutionSpecification} stereotyped << SwAccessService_ExecutionSpecification >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ExecutionSpecification}
     * @return a {@link SwAccessServiceExecutionSpecification} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9ba8b5c1-063a-47ce-97a1-3edc3bce1362")
    public static SwAccessServiceExecutionSpecification safeInstantiate(final ExecutionSpecification obj) throws IllegalArgumentException {
        if (SwAccessServiceExecutionSpecification.canInstantiate(obj))
        	return new SwAccessServiceExecutionSpecification(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceExecutionSpecification: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6fc855b1-db9d-4705-aa9c-40078ae07ca7")
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
        SwAccessServiceExecutionSpecification other = (SwAccessServiceExecutionSpecification) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ExecutionSpecification}. 
     * @return the ExecutionSpecification represented by this proxy, never null.
     */
    @objid ("5020cfc6-3b7f-457f-900d-24459e8a1a09")
    @Override
    public ExecutionSpecification getElement() {
        return (ExecutionSpecification)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_ExecutionSpecification_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7eb0d1ff-7fe8-4ac4-90cd-c897bffe46a1")
    public String getSwAccessService_ExecutionSpecification_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceExecutionSpecification.MdaTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @objid ("3654fdfd-5455-49cd-a9ad-5cb6aefaa354")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_ExecutionSpecification_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5a64ced-2c54-473e-a73c-402bc8580da9")
    public boolean isSwAccessService_ExecutionSpecification_isModifier() {
        return this.elt.isTagged(SwAccessServiceExecutionSpecification.MdaTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_ExecutionSpecification_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5189bb9-6074-449f-81ca-d7e513f8a47e")
    public void setSwAccessService_ExecutionSpecification_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceExecutionSpecification.MdaTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_ExecutionSpecification_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa86c5b4-37bc-48aa-952f-167f09a6129e")
    public void setSwAccessService_ExecutionSpecification_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceExecutionSpecification.MdaTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceExecutionSpecification.MdaTypes.SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER_TAGTYPE_ELT);
    }

    @objid ("49fba989-447e-400a-8362-2fdf50b192d1")
    protected SwAccessServiceExecutionSpecification(final ExecutionSpecification elt) {
        super(elt);
    }

    @objid ("f486c0f2-6be5-4589-aed1-6b163f9a5bf9")
    public static final class MdaTypes {
        @objid ("23052222-fd8b-4ada-8e56-013a45258fc2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1ce1b028-6c5b-4d10-9192-cc7309f2436e")
        public static TagType SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER_TAGTYPE_ELT;

        @objid ("86ee7ebf-fc3c-44e5-bb0e-6d62f0cf288b")
        public static TagType SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT_TAGTYPE_ELT;

        @objid ("309ac205-124b-48c3-a410-c813cf0e5600")
        private static Stereotype MDAASSOCDEP;

        @objid ("0da8fdba-e963-4639-aad3-17479f3e932c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("888adbd6-8005-4389-9ec9-91de58debf97")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a588c6-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_EXECUTIONSPECIFICATION_ISMODIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb04-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_EXECUTIONSPECIFICATION_ACCESSEDELEMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb0a-0ccf-11df-8525-001302895b2b");
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
