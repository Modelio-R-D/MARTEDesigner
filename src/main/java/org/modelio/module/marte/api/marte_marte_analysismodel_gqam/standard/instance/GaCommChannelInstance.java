/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SchedulableResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << GaCommChannel_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("70e1005f-2b08-4833-81e7-a551855045fd")
public class GaCommChannelInstance extends SchedulableResourceInstance {
    @objid ("94376200-24ff-49b0-b850-7e7e1e59812d")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Instance";

    @objid ("f38d14e1-48fe-43f4-b075-65c28a3488db")
    public static final String GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE = "GaCommChannel_Instance_packetSize";

    @objid ("ee6a221f-b04a-4ebf-8e5e-0795baff89b1")
    public static final String GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE = "GaCommChannel_Instance_utilization";

    /**
     * Tells whether a {@link GaCommChannelInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << GaCommChannel_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d61bfbe4-3ff9-4180-accd-29e774c5f345")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << GaCommChannel_Instance >> then instantiate a {@link GaCommChannelInstance} proxy.
     * 
     * @return a {@link GaCommChannelInstance} proxy on the created {@link Instance}.
     */
    @objid ("1f8831ba-30a6-40ef-ac23-01d2718cbca3")
    public static GaCommChannelInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelInstance.STEREOTYPE_NAME);
        return GaCommChannelInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelInstance} proxy from a {@link Instance} stereotyped << GaCommChannel_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link GaCommChannelInstance} proxy or <i>null</i>.
     */
    @objid ("6ebe0aeb-a40d-4519-9630-cf8287eb3dd7")
    public static GaCommChannelInstance instantiate(final Instance obj) {
        return GaCommChannelInstance.canInstantiate(obj) ? new GaCommChannelInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelInstance} proxy from a {@link Instance} stereotyped << GaCommChannel_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link GaCommChannelInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0687a979-50f2-4b91-b3ab-f4301c795668")
    public static GaCommChannelInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (GaCommChannelInstance.canInstantiate(obj))
        	return new GaCommChannelInstance(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("78acda7a-4a95-4683-bb43-d033c0ae47ac")
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
        GaCommChannelInstance other = (GaCommChannelInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("f55562ec-dc0b-4dc2-a80b-46379e09e782")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Instance_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("73ecd661-e755-405e-9a60-23e919248b57")
    public String getGaCommChannel_Instance_packetSize() {
        return this.elt.getTagValue(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Instance_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9d99641c-5dde-4e31-8cba-8f49a811a061")
    public List<String> getGaCommChannel_Instance_utilization() {
        return this.elt.getTagValues(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("191ab937-4086-4ebb-9c7c-bd55d9db2e96")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Instance_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("339dca02-5f81-4eb1-9b4f-65be2d911c86")
    public void setGaCommChannel_Instance_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d0d80bc-23e6-423f-bb66-fa7e5eeb03a3")
    public void setGaCommChannel_Instance_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("9634de08-14ae-457b-882d-ca7b2b7a4489")
    protected GaCommChannelInstance(final Instance elt) {
        super(elt);
    }

    @objid ("23571b1b-d8a2-4f76-ab56-7fe0b86984fb")
    public static final class MdaTypes {
        @objid ("88b5a427-3d88-4798-a479-64e7a1d9205e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ba82cd37-86f8-4693-98e2-6bc984223eec")
        public static TagType GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("0c1af78c-0e8e-4a3f-a6e3-9bdbac4b7354")
        public static TagType GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        @objid ("0f91d326-fb3c-4156-937c-8f65a45856fe")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b437e2a-e984-418a-91c9-51d2b22472cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4e4448e-59c4-4ad8-9d7a-dd1534e0f8a5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "036f462f-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4636-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f463d-0ccf-11df-8525-001302895b2b");
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
