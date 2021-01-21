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
 * Proxy class to handle a {@link Link} with << ConcurrencyResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f8feabfc-b65a-4121-8e51-20e9807b2d28")
public class ConcurrencyResourceLink extends ResourceLink {
    @objid ("2d3102b1-2d22-4289-aa61-66d018ca86fe")
    public static final String STEREOTYPE_NAME = "ConcurrencyResource_Link";

    /**
     * Tells whether a {@link ConcurrencyResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << ConcurrencyResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c055cf2c-b14c-40b6-9a9f-2664347c44f0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << ConcurrencyResource_Link >> then instantiate a {@link ConcurrencyResourceLink} proxy.
     * 
     * @return a {@link ConcurrencyResourceLink} proxy on the created {@link Link}.
     */
    @objid ("76dc292f-b3d2-45bd-8aed-e8e69b2b78a4")
    public static ConcurrencyResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ConcurrencyResourceLink.STEREOTYPE_NAME);
        return ConcurrencyResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceLink} proxy from a {@link Link} stereotyped << ConcurrencyResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ConcurrencyResourceLink} proxy or <i>null</i>.
     */
    @objid ("d275e48e-7f0f-470a-8696-eb9225d58280")
    public static ConcurrencyResourceLink instantiate(final Link obj) {
        return ConcurrencyResourceLink.canInstantiate(obj) ? new ConcurrencyResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConcurrencyResourceLink} proxy from a {@link Link} stereotyped << ConcurrencyResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link ConcurrencyResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9686aba7-c07c-49f6-be1e-7c8b6a4d0774")
    public static ConcurrencyResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ConcurrencyResourceLink.canInstantiate(obj))
        	return new ConcurrencyResourceLink(obj);
        else
        	throw new IllegalArgumentException("ConcurrencyResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0daa7a4f-29c5-4527-becf-7f64af70251a")
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
        ConcurrencyResourceLink other = (ConcurrencyResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("9d896e6e-2a60-4692-ad58-c3bd70fed364")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("7c822a71-e5fe-4649-8f69-39a9b82a7960")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("835f8064-01c9-4b5e-91d9-d1e3e2e288f3")
    protected ConcurrencyResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("05716f43-24c8-476f-b712-9cb64b96ca37")
    public static final class MdaTypes {
        @objid ("38ba66dd-ca04-4ef0-a5c5-6903416e2a14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94321d55-55fc-4d57-b488-887e8458e949")
        private static Stereotype MDAASSOCDEP;

        @objid ("06e3a3e6-74f0-4967-9df0-c6aff3ff8c97")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("69c106ac-681e-45d1-983b-64487fec8060")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "958a7c77-0f3e-11df-8c52-0014222a9f79");
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
