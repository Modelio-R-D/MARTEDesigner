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
 * Proxy class to handle a {@link Association} with << HwSupport_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e3a15ae5-c7bf-4554-b67c-6af3d5ea6f09")
public class HwSupportAssociation extends HwDeviceAssociation {
    @objid ("83e400a9-4296-42be-960a-c9c1c83af634")
    public static final String STEREOTYPE_NAME = "HwSupport_Association";

    /**
     * Tells whether a {@link HwSupportAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwSupport_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("638ff2c8-db64-4cb0-a69c-60b2162936db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwSupport_Association >> then instantiate a {@link HwSupportAssociation} proxy.
     * 
     * @return a {@link HwSupportAssociation} proxy on the created {@link Association}.
     */
    @objid ("b9247228-5519-4cd9-86b5-f0ab2a8417f4")
    public static HwSupportAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAssociation.STEREOTYPE_NAME);
        return HwSupportAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportAssociation} proxy from a {@link Association} stereotyped << HwSupport_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwSupportAssociation} proxy or <i>null</i>.
     */
    @objid ("0bc8dad8-2543-47d7-b2e4-0571bc5f3f2a")
    public static HwSupportAssociation instantiate(final Association obj) {
        return HwSupportAssociation.canInstantiate(obj) ? new HwSupportAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportAssociation} proxy from a {@link Association} stereotyped << HwSupport_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwSupportAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("776d0fd2-cc29-43bf-bcd8-4acc4b27c9b2")
    public static HwSupportAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwSupportAssociation.canInstantiate(obj))
        	return new HwSupportAssociation(obj);
        else
        	throw new IllegalArgumentException("HwSupportAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("db0601f0-9ae0-4581-96e6-1c2993abad85")
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
        HwSupportAssociation other = (HwSupportAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("f9177f33-8d68-4429-9c4c-53a2cc7ced60")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("b78683b5-e581-46ae-ac84-9a7cec09904b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b58135fe-7b74-4865-9665-961648ab673a")
    protected HwSupportAssociation(final Association elt) {
        super(elt);
    }

    @objid ("93b11b4f-1ef7-4b74-a8da-4f877e577e5d")
    public static final class MdaTypes {
        @objid ("e788d1c0-d675-4897-ae73-a53b3fa4b277")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("710143a3-5c63-4700-aa4a-5794a80263e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1b8229f-3b48-4d86-a5be-3978bae1a018")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6dc97f93-4ced-4120-b6b3-869ae8282abf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "78e7b2a2-10b0-11df-81d9-0014222a9f79");
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
