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
 * Proxy class to handle a {@link Association} with << HwArbiter_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("31e03e6e-7580-46ca-93b7-5920efa6153b")
public class HwArbiterAssociation extends HwCommunicationResourceAssociation {
    @objid ("95cc051d-6ea8-4825-aabb-5c509416b35f")
    public static final String STEREOTYPE_NAME = "HwArbiter_Association";

    @objid ("9be77986-1a16-48e0-a36d-9cd33ba82595")
    public static final String HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Association_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwArbiter_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("862187fe-29a6-405d-ad6e-ce0015921ed7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwArbiter_Association >> then instantiate a {@link HwArbiterAssociation} proxy.
     * 
     * @return a {@link HwArbiterAssociation} proxy on the created {@link Association}.
     */
    @objid ("abcd9fcf-a2ca-48cd-b235-923b8424284a")
    public static HwArbiterAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAssociation.STEREOTYPE_NAME);
        return HwArbiterAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterAssociation} proxy from a {@link Association} stereotyped << HwArbiter_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwArbiterAssociation} proxy or <i>null</i>.
     */
    @objid ("fa264a69-1c2c-4676-b8a3-b5bf936272f4")
    public static HwArbiterAssociation instantiate(final Association obj) {
        return HwArbiterAssociation.canInstantiate(obj) ? new HwArbiterAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterAssociation} proxy from a {@link Association} stereotyped << HwArbiter_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwArbiterAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c9182ff4-0713-4099-8e19-9d8ccd2b8d34")
    public static HwArbiterAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwArbiterAssociation.canInstantiate(obj))
        	return new HwArbiterAssociation(obj);
        else
        	throw new IllegalArgumentException("HwArbiterAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8fce5ca1-2f46-484b-ace2-9969fb076a5a")
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
        HwArbiterAssociation other = (HwArbiterAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("8dd2ad67-6f41-4afe-9b0a-3945da0279bd")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Association_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b69bf0f0-8760-4606-b535-7a0b9050db96")
    public List<String> getHwArbiter_Association_controlledMedias() {
        return this.elt.getTagValues(HwArbiterAssociation.MdaTypes.HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("55f0eb18-526f-4f18-b259-941927819ed0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Association_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("142f8b1a-037c-4f4e-80e9-ad075a174803")
    public void setHwArbiter_Association_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterAssociation.MdaTypes.HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("765bb0e2-e2f7-4d36-9b85-66a5101edb65")
    protected HwArbiterAssociation(final Association elt) {
        super(elt);
    }

    @objid ("2275a4a2-d7b0-4b41-af43-837860ae8d43")
    public static final class MdaTypes {
        @objid ("bf44510e-b2ec-433d-ba2e-efd00917c48e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dfce16bb-0f0c-4cb6-b7ff-30213a092365")
        public static TagType HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("f378b17e-0db7-436c-ae01-0e1fb1de6fd6")
        private static Stereotype MDAASSOCDEP;

        @objid ("0ac172d0-60a9-430f-956f-a400e761dea6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("857a70a5-46db-4bb8-b336-f5fc31abe22e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5e4a9577-10ad-11df-81d9-0014222a9f79");
            HWARBITER_ASSOCIATION_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e4a9578-10ad-11df-81d9-0014222a9f79");
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