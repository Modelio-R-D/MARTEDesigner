/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.link;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Link} with << SwSynchronizationResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c2ad6315-e119-47dc-88fe-ccd936ea9bf2")
public class SwSynchronizationResourceLink extends SwInteractionResourceLink {
    @objid ("231c3f9a-0cf4-48e3-b3c3-9352ea6cff2a")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Link";

    /**
     * Tells whether a {@link SwSynchronizationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SwSynchronizationResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("45218533-0fdd-4437-a218-678e99515f55")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SwSynchronizationResource_Link >> then instantiate a {@link SwSynchronizationResourceLink} proxy.
     * 
     * @return a {@link SwSynchronizationResourceLink} proxy on the created {@link Link}.
     */
    @objid ("3ac75e78-1aaa-464b-b041-15cf3300e7f7")
    public static SwSynchronizationResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceLink.STEREOTYPE_NAME);
        return SwSynchronizationResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceLink} proxy from a {@link Link} stereotyped << SwSynchronizationResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SwSynchronizationResourceLink} proxy or <i>null</i>.
     */
    @objid ("e3e71808-1836-4ad8-852f-0fbac551cb75")
    public static SwSynchronizationResourceLink instantiate(final Link obj) {
        return SwSynchronizationResourceLink.canInstantiate(obj) ? new SwSynchronizationResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceLink} proxy from a {@link Link} stereotyped << SwSynchronizationResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SwSynchronizationResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d38492db-00ef-44fa-adff-74cf1b93757a")
    public static SwSynchronizationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceLink.canInstantiate(obj))
        	return new SwSynchronizationResourceLink(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d6064ada-c154-42e7-91ca-783ba7842fdc")
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
        SwSynchronizationResourceLink other = (SwSynchronizationResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("c600ff14-8d1d-4194-9745-a0c6781b94dd")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("89ec4dae-48fd-4255-a973-2cb9f1ec2b04")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4cdfc326-c679-48fd-b01f-e595ecdd1b53")
    protected SwSynchronizationResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("d75d7892-7047-4a3f-9dca-64c1e4a72aa5")
    public static final class MdaTypes {
        @objid ("8533d0d7-8e68-444e-bd79-d1797f6db307")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e7ea095-0980-486c-b5d2-e466b12827fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ee4bfc8-efbd-4419-9aa3-d1a73f9ec8e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("189b36fd-3251-4841-a2c1-847ff06d5290")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0217f813-0ccf-11df-8525-001302895b2b");
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
