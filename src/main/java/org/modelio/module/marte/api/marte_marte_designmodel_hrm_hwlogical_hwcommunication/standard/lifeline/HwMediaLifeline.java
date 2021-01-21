/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwMedia_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2335c3b3-4220-4754-bb6f-da262a04366f")
public class HwMediaLifeline extends HwCommunicationResourceLifeline {
    @objid ("ff7eecb4-f4b5-47c8-8e3a-fc3adfaddb05")
    public static final String STEREOTYPE_NAME = "HwMedia_Lifeline";

    @objid ("ffc75d92-47c6-456b-8ff8-73c0c415da9a")
    public static final String HWMEDIA_LIFELINE_ARBITERS_TAGTYPE = "HwMedia_Lifeline_arbiters";

    @objid ("fea5f7ce-08f4-48dc-8a73-5c3b5c704e83")
    public static final String HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE = "HwMedia_Lifeline_bandwidth";

    /**
     * Tells whether a {@link HwMediaLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwMedia_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fd5e2e23-2659-4663-b22c-519dca91f3cd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwMedia_Lifeline >> then instantiate a {@link HwMediaLifeline} proxy.
     * 
     * @return a {@link HwMediaLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("78235d86-d271-4e88-9755-82cb15aaa464")
    public static HwMediaLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaLifeline.STEREOTYPE_NAME);
        return HwMediaLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaLifeline} proxy from a {@link Lifeline} stereotyped << HwMedia_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwMediaLifeline} proxy or <i>null</i>.
     */
    @objid ("4f7b5757-8410-4750-a5c5-c9ca07bcf35d")
    public static HwMediaLifeline instantiate(final Lifeline obj) {
        return HwMediaLifeline.canInstantiate(obj) ? new HwMediaLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaLifeline} proxy from a {@link Lifeline} stereotyped << HwMedia_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwMediaLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("89bcf3c1-3277-42b0-907c-2f9c87530125")
    public static HwMediaLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwMediaLifeline.canInstantiate(obj))
        	return new HwMediaLifeline(obj);
        else
        	throw new IllegalArgumentException("HwMediaLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("04ed1d6a-218a-4e63-a203-e5143630b786")
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
        HwMediaLifeline other = (HwMediaLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("bcedb498-acc3-4870-96be-4904cc7da6c4")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Lifeline_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b9ea8bff-5a80-4152-8276-f78a489dfef1")
    public List<String> getHwMedia_Lifeline_arbiters() {
        return this.elt.getTagValues(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Lifeline_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1209aa8-40e6-456a-b2d7-1589d3305278")
    public String getHwMedia_Lifeline_bandwidth() {
        return this.elt.getTagValue(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("a887e0df-61d5-4945-a75b-fc4cf27ae9f5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Lifeline_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("03b5e20b-7d55-49b1-98e4-df117fe96d39")
    public void setHwMedia_Lifeline_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Lifeline_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2b9f7915-f46a-4d15-9d66-2e1526448ee7")
    public void setHwMedia_Lifeline_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaLifeline.MdaTypes.HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("b4e2ff4b-ddbf-4a97-918c-9b74d66c9a45")
    protected HwMediaLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("f4c8c489-1019-4f01-9293-52a40f8cef1b")
    public static final class MdaTypes {
        @objid ("56774e76-ba24-40e2-b4ea-a7438509d553")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef186340-d000-44c7-b41e-651449841f4c")
        public static TagType HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT;

        @objid ("11d88fc7-24cb-4f8b-a83a-a79f292cda37")
        public static TagType HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT;

        @objid ("157f3685-7cc0-4107-9865-b4958d06a2ef")
        private static Stereotype MDAASSOCDEP;

        @objid ("12a66ee8-f3de-4c79-a4f6-ec175b2d289d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("21616bf3-e786-48e4-9e12-090da59c4448")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b7d80faa-10ac-11df-81d9-0014222a9f79");
            HWMEDIA_LIFELINE_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0a32a190-1727-11df-b92a-0014222a9f79");
            HWMEDIA_LIFELINE_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a5e71b01-5d9c-11df-9e91-0014222a9f79");
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
