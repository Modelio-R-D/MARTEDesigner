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
 * Proxy class to handle a {@link Link} with << HwActuator_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f8f075c7-1112-40c5-9c9a-43f92f36ebaf")
public class HwActuatorLink extends HwIOLink {
    @objid ("90ba8d3e-4787-4c76-90cb-3e1b65aad975")
    public static final String STEREOTYPE_NAME = "HwActuator_Link";

    /**
     * Tells whether a {@link HwActuatorLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwActuator_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("49eb3787-5259-4c75-a74b-e1da2d3a66aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwActuator_Link >> then instantiate a {@link HwActuatorLink} proxy.
     * 
     * @return a {@link HwActuatorLink} proxy on the created {@link Link}.
     */
    @objid ("c6e0c3d7-a9bc-4e2e-9a3f-d1566491be90")
    public static HwActuatorLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorLink.STEREOTYPE_NAME);
        return HwActuatorLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorLink} proxy from a {@link Link} stereotyped << HwActuator_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwActuatorLink} proxy or <i>null</i>.
     */
    @objid ("4147f4e8-a873-424f-a1fd-9b2c6913ea53")
    public static HwActuatorLink instantiate(final Link obj) {
        return HwActuatorLink.canInstantiate(obj) ? new HwActuatorLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorLink} proxy from a {@link Link} stereotyped << HwActuator_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwActuatorLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1f350248-9fdd-4434-b588-a4c81a2f6b01")
    public static HwActuatorLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwActuatorLink.canInstantiate(obj))
        	return new HwActuatorLink(obj);
        else
        	throw new IllegalArgumentException("HwActuatorLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("727e673b-3f49-44ca-a68d-9502c30e3dcb")
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
        HwActuatorLink other = (HwActuatorLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("cbecce97-c387-4155-8a9b-db42d6e02461")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("14f646a2-c73e-47f8-8dd3-a520fba60b06")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9f5f7a14-7a03-4e09-bc98-e3bcee05f2c4")
    protected HwActuatorLink(final Link elt) {
        super(elt);
    }

    @objid ("fe0e38d2-dbb1-4f5c-bef7-9379879d4332")
    public static final class MdaTypes {
        @objid ("d8016a15-6827-433d-a244-80544b08767c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8bfce454-69ae-474a-ad9c-f384a03b3e53")
        private static Stereotype MDAASSOCDEP;

        @objid ("887545b9-5d93-4bb6-bae1-cbd6c9554178")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1c55e8b3-1bc5-4940-ac2d-6684b99fc8ba")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37415-c7ac-11df-ad39-001302895b2b");
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