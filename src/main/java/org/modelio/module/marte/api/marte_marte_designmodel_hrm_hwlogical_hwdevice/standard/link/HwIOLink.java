/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.link;

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
 * Proxy class to handle a {@link Link} with << HwI_O_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("83293c78-36aa-460e-b289-cdf6ff37bed8")
public class HwIOLink extends HwDeviceLink {
    @objid ("10c324bd-9ccf-4ba6-b540-729939176789")
    public static final String STEREOTYPE_NAME = "HwI_O_Link";

    /**
     * Tells whether a {@link HwIOLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwI_O_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c24d7c6f-66e5-4d89-a21a-94a177344622")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwI_O_Link >> then instantiate a {@link HwIOLink} proxy.
     * 
     * @return a {@link HwIOLink} proxy on the created {@link Link}.
     */
    @objid ("33934c84-55d4-47bb-96b4-e140f43b71eb")
    public static HwIOLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOLink.STEREOTYPE_NAME);
        return HwIOLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwIOLink} proxy from a {@link Link} stereotyped << HwI_O_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwIOLink} proxy or <i>null</i>.
     */
    @objid ("e22f18eb-b135-47df-8c0c-2b0a7cea390e")
    public static HwIOLink instantiate(final Link obj) {
        return HwIOLink.canInstantiate(obj) ? new HwIOLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOLink} proxy from a {@link Link} stereotyped << HwI_O_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwIOLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5493c807-39f4-444c-8ff8-a92baed7ce7e")
    public static HwIOLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwIOLink.canInstantiate(obj))
        	return new HwIOLink(obj);
        else
        	throw new IllegalArgumentException("HwIOLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6de1917c-e9b1-4c4b-bc85-c65ae4196067")
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
        HwIOLink other = (HwIOLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("6b491308-cbd4-44a0-981c-d0cbfe7bd201")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("f34441fe-251d-4c89-9f5a-08005dea4a67")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("20b9ee72-4759-497d-a9e7-5b5a79949433")
    protected HwIOLink(final Link elt) {
        super(elt);
    }

    @objid ("9b724d2b-e7ea-4f3a-914c-3791d995aa19")
    public static final class MdaTypes {
        @objid ("8ee17266-4c4a-4834-bf0a-636b41cc613d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5c11877e-d928-4b21-9588-9ae3aab62abf")
        private static Stereotype MDAASSOCDEP;

        @objid ("88138f6b-73c1-48a7-8fc6-cb6c2d0311f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29685cea-cfd9-496d-bd28-2c767fc926e4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0137ddf7-0ccf-11df-8525-001302895b2b");
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
