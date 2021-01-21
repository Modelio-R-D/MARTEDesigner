/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.link;

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
 * Proxy class to handle a {@link Link} with << HwBridge_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8f4258ff-2375-430b-a9c1-b2a9f56580ad")
public class HwBridgeLink extends HwMediaLink {
    @objid ("59c91639-fd09-4167-9c90-daa14295f273")
    public static final String STEREOTYPE_NAME = "HwBridge_Link";

    @objid ("ebe01cd0-372e-4603-b01f-b19d96a0c5cd")
    public static final String HWBRIDGE_LINK_SIDES_TAGTYPE = "HwBridge_Link_sides";

    /**
     * Tells whether a {@link HwBridgeLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwBridge_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5d1aeff2-e89b-4a61-ac9e-7ede29b58335")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwBridge_Link >> then instantiate a {@link HwBridgeLink} proxy.
     * 
     * @return a {@link HwBridgeLink} proxy on the created {@link Link}.
     */
    @objid ("70bfb574-c7d3-485c-b847-de86851cc311")
    public static HwBridgeLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeLink.STEREOTYPE_NAME);
        return HwBridgeLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeLink} proxy from a {@link Link} stereotyped << HwBridge_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwBridgeLink} proxy or <i>null</i>.
     */
    @objid ("c2fbdfd9-c5ac-49e3-a71c-ad6c9c7eaf79")
    public static HwBridgeLink instantiate(final Link obj) {
        return HwBridgeLink.canInstantiate(obj) ? new HwBridgeLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeLink} proxy from a {@link Link} stereotyped << HwBridge_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwBridgeLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c616521a-e23c-47eb-8875-ea6c23182507")
    public static HwBridgeLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwBridgeLink.canInstantiate(obj))
        	return new HwBridgeLink(obj);
        else
        	throw new IllegalArgumentException("HwBridgeLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ad9f7cbc-0f8c-47e0-87b4-26073265f9e6")
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
        HwBridgeLink other = (HwBridgeLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("9fd29292-79df-4a7d-8040-6f573a607280")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Link_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("389f6f4e-c5ec-4657-9458-3f44bc856ef9")
    public List<String> getHwBridge_Link_sides() {
        return this.elt.getTagValues(HwBridgeLink.MdaTypes.HWBRIDGE_LINK_SIDES_TAGTYPE_ELT);
    }

    @objid ("93805a82-8e37-4fc6-aa1a-1c8c46c4d766")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Link_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c6e80df-7702-4265-b3b6-18ce288807c5")
    public void setHwBridge_Link_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeLink.MdaTypes.HWBRIDGE_LINK_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("20a0634c-dd1c-46e7-8715-1902228f02f0")
    protected HwBridgeLink(final Link elt) {
        super(elt);
    }

    @objid ("6413bd8a-1237-4dd3-bb36-6ee6c1802d2c")
    public static final class MdaTypes {
        @objid ("566ed97e-46d8-4bf9-a3e1-e9ae0fefc196")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6ffa75d0-14d6-46da-ae40-50489dac4f9f")
        public static TagType HWBRIDGE_LINK_SIDES_TAGTYPE_ELT;

        @objid ("7e398bfc-67b8-4381-9d06-244c22635385")
        private static Stereotype MDAASSOCDEP;

        @objid ("02e16cb8-b20b-46dd-b0fc-da31ae5d0ddf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1d25077-afca-46e4-bff8-c0e8149069bc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "011da470-0ccf-11df-8525-001302895b2b");
            HWBRIDGE_LINK_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c1eae09d-1726-11df-b92a-0014222a9f79");
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
