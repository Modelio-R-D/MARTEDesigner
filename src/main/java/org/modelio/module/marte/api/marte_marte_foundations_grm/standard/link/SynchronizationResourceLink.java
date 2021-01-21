/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
 * Proxy class to handle a {@link Link} with << SynchronizationResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("60e4a373-d56f-485c-9a72-11c3e0f43d73")
public class SynchronizationResourceLink extends ResourceLink {
    @objid ("ca32a0fc-2342-4e39-a38f-daea042087fa")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Link";

    /**
     * Tells whether a {@link SynchronizationResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << SynchronizationResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5de3340c-59b2-44c9-91ec-41ba6cb56c87")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << SynchronizationResource_Link >> then instantiate a {@link SynchronizationResourceLink} proxy.
     * 
     * @return a {@link SynchronizationResourceLink} proxy on the created {@link Link}.
     */
    @objid ("b183ff3b-4ae0-481a-a7da-b8fa5136e7d3")
    public static SynchronizationResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceLink.STEREOTYPE_NAME);
        return SynchronizationResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceLink} proxy from a {@link Link} stereotyped << SynchronizationResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link SynchronizationResourceLink} proxy or <i>null</i>.
     */
    @objid ("d64c9614-c9fd-40b8-a70b-6524f00c5a25")
    public static SynchronizationResourceLink instantiate(final Link obj) {
        return SynchronizationResourceLink.canInstantiate(obj) ? new SynchronizationResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceLink} proxy from a {@link Link} stereotyped << SynchronizationResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link SynchronizationResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("db2ff910-ab86-4854-96cc-4fe456c8b9ef")
    public static SynchronizationResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (SynchronizationResourceLink.canInstantiate(obj))
        	return new SynchronizationResourceLink(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("84971c1f-25bd-4f99-a152-fc44c45cce6b")
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
        SynchronizationResourceLink other = (SynchronizationResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("2c0b289f-06c1-43db-a292-33c9f50d1f28")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("c8696f14-e458-47fb-a259-9009f7924cb5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("62d18749-6455-4cf2-bb05-f6b665da02cc")
    protected SynchronizationResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("a3698f8b-1437-4787-8e1a-260d53b9dee3")
    public static final class MdaTypes {
        @objid ("7248f744-c7a4-40bb-b267-a8fcf39fa604")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("61820faf-3fe7-43b9-bd69-61b3f90fd64e")
        private static Stereotype MDAASSOCDEP;

        @objid ("85cd8c58-abda-4efe-bbb5-407a33ed0a8c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bbde5a08-f3dc-4c34-8691-77fe5430a5f7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa75826-0cce-11df-8525-001302895b2b");
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
