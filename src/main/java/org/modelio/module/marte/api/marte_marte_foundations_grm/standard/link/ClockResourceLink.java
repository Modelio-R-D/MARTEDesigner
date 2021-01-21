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
 * Proxy class to handle a {@link Link} with << ClockResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d5576477-5cee-46d3-be26-78ecf8bec98b")
public class ClockResourceLink extends TimingResourceLink {
    @objid ("fd4acff5-662f-4085-b2de-aed53a8693d8")
    public static final String STEREOTYPE_NAME = "ClockResource_Link";

    /**
     * Tells whether a {@link ClockResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << ClockResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("667a4912-738c-48c5-9519-acab2804744a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << ClockResource_Link >> then instantiate a {@link ClockResourceLink} proxy.
     * 
     * @return a {@link ClockResourceLink} proxy on the created {@link Link}.
     */
    @objid ("927802f7-73c3-4d20-95ad-34253fd595a6")
    public static ClockResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceLink.STEREOTYPE_NAME);
        return ClockResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceLink} proxy from a {@link Link} stereotyped << ClockResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link ClockResourceLink} proxy or <i>null</i>.
     */
    @objid ("d33030ab-548e-4e62-87b3-80b798634da8")
    public static ClockResourceLink instantiate(final Link obj) {
        return ClockResourceLink.canInstantiate(obj) ? new ClockResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceLink} proxy from a {@link Link} stereotyped << ClockResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link ClockResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a609223c-14e9-40b9-b641-429f263cfa7a")
    public static ClockResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (ClockResourceLink.canInstantiate(obj))
        	return new ClockResourceLink(obj);
        else
        	throw new IllegalArgumentException("ClockResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("81d93d2d-0a99-4092-a790-a20fc5c94cc3")
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
        ClockResourceLink other = (ClockResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("48046d99-4725-4dd9-a272-f9437353a116")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("48bc88a7-e7da-42f9-97e1-d5a0a05aa3b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7c7b3685-caf3-4a84-bea5-79c8831fa248")
    protected ClockResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("0117fb26-0b5b-49a2-8bf1-371624ab2aaa")
    public static final class MdaTypes {
        @objid ("95bb4d15-2764-4875-bda2-fea6ed8eb035")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("764f34a2-d3e9-46b0-8e69-fda784aad98a")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0a14ac5-3382-4a5e-972f-eb53eb1891cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("feaabe20-4641-496f-88f2-046345bd728a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02c15d2f-0f43-11df-8c52-0014222a9f79");
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
