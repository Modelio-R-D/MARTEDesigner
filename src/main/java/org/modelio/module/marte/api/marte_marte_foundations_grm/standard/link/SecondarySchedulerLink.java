/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class SecondarySchedulerLink extends SchedulerLink {
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Link";

    public static final String SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Link_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SecondaryScheduler_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SecondaryScheduler_Link >> then instantiate a {@link SecondarySchedulerLink} proxy.
     * 
     * @return a {@link SecondarySchedulerLink} proxy on the created {@link Link}.
     */
    public static SecondarySchedulerLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerLink.STEREOTYPE_NAME);
        return SecondarySchedulerLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerLink} proxy from a {@link Link} stereotyped << SecondaryScheduler_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SecondarySchedulerLink} proxy or <i>null</i>.
     */
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
    public static SecondarySchedulerLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SecondarySchedulerLink.canInstantiate(obj))
        	return new SecondarySchedulerLink(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SecondarySchedulerLink other = (SecondarySchedulerLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Link_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSecondaryScheduler_Link_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerLink.MdaTypes.SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Link_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSecondaryScheduler_Link_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerLink.MdaTypes.SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    protected SecondarySchedulerLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SECONDARYSCHEDULER_LINK_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
