/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwBridge_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9ddec143-0a11-427a-8331-dc4db003b3eb")
public class HwBridgeAssociation extends HwMediaAssociation {
    @objid ("fe44ab0b-1b30-4f37-92ff-6aadb2d1181c")
    public static final String STEREOTYPE_NAME = "HwBridge_Association";

    @objid ("a9d9c72b-4515-45ca-94d3-07bc49a893db")
    public static final String HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE = "HwBridge_Association_sides";

    /**
     * Tells whether a {@link HwBridgeAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBridge_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("705442d9-d7b4-4a3e-9f3c-31523c121985")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBridge_Association >> then instantiate a {@link HwBridgeAssociation} proxy.
     * 
     * @return a {@link HwBridgeAssociation} proxy on the created {@link Association}.
     */
    @objid ("af4821f2-93e8-4500-9932-ae49287d27d8")
    public static HwBridgeAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociation.STEREOTYPE_NAME);
        return HwBridgeAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociation} proxy from a {@link Association} stereotyped << HwBridge_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwBridgeAssociation} proxy or <i>null</i>.
     */
    @objid ("1df2fb5d-6f96-40ae-9207-848ac5305fc2")
    public static HwBridgeAssociation instantiate(final Association obj) {
        return HwBridgeAssociation.canInstantiate(obj) ? new HwBridgeAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociation} proxy from a {@link Association} stereotyped << HwBridge_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwBridgeAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b1ba7f7c-26ac-4864-bdb5-280449c58ca1")
    public static HwBridgeAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBridgeAssociation.canInstantiate(obj))
        	return new HwBridgeAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBridgeAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b97189be-93e9-4317-a9c9-7b6d6f80d514")
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
        HwBridgeAssociation other = (HwBridgeAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("80938b8e-e627-4ba5-b18a-f7ed11545741")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Association_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d6c777ca-72ed-40fd-ac18-0b0ab4a124ab")
    public List<String> getHwBridge_Association_sides() {
        return this.elt.getTagValues(HwBridgeAssociation.MdaTypes.HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE_ELT);
    }

    @objid ("62519a37-1dc9-4688-9032-458dcb115e00")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Association_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a53f64b-9763-4d08-ab52-eb30d71b28a7")
    public void setHwBridge_Association_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeAssociation.MdaTypes.HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("db4a0dcb-36c8-4b76-af37-d80b5e2c4727")
    protected HwBridgeAssociation(final Association elt) {
        super(elt);
    }

    @objid ("29b120f0-b700-4256-a90c-f308fd8641c6")
    public static final class MdaTypes {
        @objid ("b0f19ead-103c-486f-899a-8205e6022b79")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a2503dc3-113b-4b07-968c-7fa6f1cac7a1")
        public static TagType HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE_ELT;

        @objid ("e30b54f1-7f6f-4e0a-bd80-58b8ca40a709")
        private static Stereotype MDAASSOCDEP;

        @objid ("504c6582-94da-47ab-978d-156e4a22b474")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c5b5b842-b294-41f6-9139-47d1001021c9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e7e8ec3d-10ac-11df-81d9-0014222a9f79");
            HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf48283a-1726-11df-b92a-0014222a9f79");
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
