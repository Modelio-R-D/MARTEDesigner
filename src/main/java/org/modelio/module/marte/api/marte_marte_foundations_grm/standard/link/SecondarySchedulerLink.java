/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << SecondaryScheduler_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e1d12768-67f9-45c9-b94c-90d8f3f6e8cd")
public class SecondarySchedulerLink extends SchedulerLink {
    @objid ("304f8a6c-2adc-4240-917a-9c00e3c328c7")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Link";

    @objid ("a79b521c-ca11-4348-8d75-eafc47a105b7")
    public static final String SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Link_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SecondaryScheduler_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ffbfed12-ff80-44b3-b65a-b7bb5d574072")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SecondaryScheduler_Link >> then instantiate a {@link SecondarySchedulerLink} proxy.
     * 
     * @return a {@link SecondarySchedulerLink} proxy on the created {@link Link}.
     */
    @objid ("371bb9f8-e56c-4269-a50e-135a44bf0728")
    public static SecondarySchedulerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLink.STEREOTYPE_NAME);
        return SecondarySchedulerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerLink} proxy from a {@link Link} stereotyped << SecondaryScheduler_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SecondarySchedulerLink} proxy or <i>null</i>.
     */
    @objid ("6d489a0a-10ef-43e2-8b6f-02a17486810e")
    public static SecondarySchedulerLink instantiate(final Link obj) {
        return SecondarySchedulerLink.canInstantiate(obj) ? new SecondarySchedulerLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerLink} proxy from a {@link Link} stereotyped << SecondaryScheduler_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SecondarySchedulerLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5b2c10e4-f926-46c3-bc1a-48196a2f2b98")
    public static SecondarySchedulerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SecondarySchedulerLink.canInstantiate(obj))
        	return new SecondarySchedulerLink(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9d587204-2136-4dfc-a76d-74e062b1d308")
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
        SecondarySchedulerLink other = (SecondarySchedulerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("a237f18f-b4e0-40f6-b4eb-44d51fd6272d")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Link_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3125d55a-81eb-4608-a3f7-bdbec5fecd89")
    public List<String> getSecondaryScheduler_Link_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerLink.MdaTypes.SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("c6a9350e-6492-4b33-8002-892259cec983")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Link_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("258ae905-2830-4898-bfeb-2fc61d1abca3")
    public void setSecondaryScheduler_Link_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerLink.MdaTypes.SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("80a15647-2140-435f-802b-0c41e0aa3882")
    protected SecondarySchedulerLink(final Link elt) {
        super(elt);
    }

    @objid ("9b7c6791-4496-4541-88d4-a6025ff57148")
    public static final class MdaTypes {
        @objid ("e2e85a19-d4d9-4d44-9d6c-74be2f47a0f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("95445726-b15a-4eb9-b870-e208c01da64d")
        public static TagType SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("bb3133fa-2403-40d0-965d-c8e100af5857")
        private static Stereotype MDAASSOCDEP;

        @objid ("003e2dfa-e989-41df-9199-1fe0eae7aaa0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d69763d8-7ae5-4c33-bbbe-cc1ff7d63f40")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8c3b8517-0f41-11df-8c52-0014222a9f79");
            SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "75eaf9a3-16fa-11df-b92a-0014222a9f79");
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
