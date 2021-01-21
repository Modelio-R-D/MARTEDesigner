/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwI_O_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fd71f68e-1538-4d55-90c2-2bbc4eca2f9a")
public class HwIOAssociation extends HwDeviceAssociation {
    @objid ("7a55d407-48c6-477e-9fa2-96535bfef29f")
    public static final String STEREOTYPE_NAME = "HwI_O_Association";

    /**
     * Tells whether a {@link HwIOAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwI_O_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a1e6becd-b5e8-47f8-a5a0-871850b177e4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwI_O_Association >> then instantiate a {@link HwIOAssociation} proxy.
     * 
     * @return a {@link HwIOAssociation} proxy on the created {@link Association}.
     */
    @objid ("a16b3631-84ae-4c97-8679-756f2984b7cb")
    public static HwIOAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAssociation.STEREOTYPE_NAME);
        return HwIOAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwIOAssociation} proxy from a {@link Association} stereotyped << HwI_O_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwIOAssociation} proxy or <i>null</i>.
     */
    @objid ("0c3f9e67-92fa-48ae-b033-38c4f4ad25d6")
    public static HwIOAssociation instantiate(final Association obj) {
        return HwIOAssociation.canInstantiate(obj) ? new HwIOAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOAssociation} proxy from a {@link Association} stereotyped << HwI_O_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwIOAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a72da167-e29c-4f1d-9f11-3dc1401b56be")
    public static HwIOAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwIOAssociation.canInstantiate(obj))
        	return new HwIOAssociation(obj);
        else
        	throw new IllegalArgumentException("HwIOAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e35e798f-b896-4058-bb17-b33b27f5b4ae")
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
        HwIOAssociation other = (HwIOAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("d64d7bc9-53cf-4e0b-a8bd-322e7da48ab8")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("934250ef-4300-4ed1-9c8f-ff7b11d4708f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("789a8feb-4e2e-4e80-8925-464396928c0f")
    protected HwIOAssociation(final Association elt) {
        super(elt);
    }

    @objid ("4a7a6ded-4eac-4d8f-900c-c7a52ecc2a09")
    public static final class MdaTypes {
        @objid ("19467214-0c6b-4277-979d-9d819d3edce7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7206f9a1-34cb-4510-823b-c08621622e76")
        private static Stereotype MDAASSOCDEP;

        @objid ("d179973b-e6ff-4f7e-8e7a-916fd4f53d3f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6479ad53-6c93-4bb7-be05-d8a31fbf547c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "07db34c5-10b1-11df-81d9-0014222a9f79");
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
