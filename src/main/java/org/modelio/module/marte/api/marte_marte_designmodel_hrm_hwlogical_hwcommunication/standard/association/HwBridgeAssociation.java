/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
public class HwBridgeAssociation extends HwMediaAssociation {
    public static final String STEREOTYPE_NAME = "HwBridge_Association";

    public static final String HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE = "HwBridge_Association_sides";

    /**
     * Tells whether a {@link HwBridgeAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBridge_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBridge_Association >> then instantiate a {@link HwBridgeAssociation} proxy.
     * 
     * @return a {@link HwBridgeAssociation} proxy on the created {@link Association}.
     */
    public static HwBridgeAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociation.STEREOTYPE_NAME);
        return HwBridgeAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociation} proxy from a {@link Association} stereotyped << HwBridge_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwBridgeAssociation} proxy or <i>null</i>.
     */
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
    public static HwBridgeAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBridgeAssociation.canInstantiate(obj))
        	return new HwBridgeAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBridgeAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBridgeAssociation other = (HwBridgeAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Association_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwBridge_Association_sides() {
        return this.elt.getTagValues(HwBridgeAssociation.MdaTypes.HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Association_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBridge_Association_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeAssociation.MdaTypes.HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE_ELT, values);
    }

    protected HwBridgeAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBRIDGE_ASSOCIATION_SIDES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
