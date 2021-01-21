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
 * Proxy class to handle a {@link Link} with << TimingResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a6a01efa-c95f-4d6a-9be9-eaf5c4c389ab")
public class TimingResourceLink extends ResourceLink {
    @objid ("8dcf3958-cc55-4182-89a8-dea5a02927d2")
    public static final String STEREOTYPE_NAME = "TimingResource_Link";

    /**
     * Tells whether a {@link TimingResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << TimingResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("000f0bac-efc4-4d19-b8c7-47910b57dff8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << TimingResource_Link >> then instantiate a {@link TimingResourceLink} proxy.
     * 
     * @return a {@link TimingResourceLink} proxy on the created {@link Link}.
     */
    @objid ("efe9c637-fccb-4bbd-bb72-e386582e49f5")
    public static TimingResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceLink.STEREOTYPE_NAME);
        return TimingResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceLink} proxy from a {@link Link} stereotyped << TimingResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link TimingResourceLink} proxy or <i>null</i>.
     */
    @objid ("c5105566-0bfa-4012-9c77-279b5b70104e")
    public static TimingResourceLink instantiate(final Link obj) {
        return TimingResourceLink.canInstantiate(obj) ? new TimingResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceLink} proxy from a {@link Link} stereotyped << TimingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link TimingResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("17436d37-aa55-4567-a657-89e8c569e5d8")
    public static TimingResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (TimingResourceLink.canInstantiate(obj))
        	return new TimingResourceLink(obj);
        else
        	throw new IllegalArgumentException("TimingResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f32a6f22-6d2c-422c-bcc5-ad49cee3d814")
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
        TimingResourceLink other = (TimingResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("a5419282-9daa-4ca3-b674-addfef19c685")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("0f042d4c-4c2c-46e3-a0b2-ad1f09f05c0e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("baa6f616-7d1f-41fa-ab1e-f04b6111f31c")
    protected TimingResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("80fe016f-456b-44fa-ab51-8a0f37a20da7")
    public static final class MdaTypes {
        @objid ("522d71e8-db36-493b-b3bd-57b6c5b5fb68")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fcc50e9d-529d-4066-96f1-a4327b25710b")
        private static Stereotype MDAASSOCDEP;

        @objid ("d45db4bb-ae3a-41bc-b6a0-245c7e15e2f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("47272e0d-5301-4b5b-9d96-6a95e3877679")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009ce724-0ccf-11df-8525-001302895b2b");
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
