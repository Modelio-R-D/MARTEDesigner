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
 * Proxy class to handle a {@link Link} with << HwSensor_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dcdce80d-fa21-4377-bd5f-36a3c4011e83")
public class HwSensorLink extends HwIOLink {
    @objid ("e92d146e-e182-4db6-8d3a-fa8fcd11035e")
    public static final String STEREOTYPE_NAME = "HwSensor_Link";

    /**
     * Tells whether a {@link HwSensorLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwSensor_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("947ca96d-ad84-477f-8326-d8157e7612e7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwSensor_Link >> then instantiate a {@link HwSensorLink} proxy.
     * 
     * @return a {@link HwSensorLink} proxy on the created {@link Link}.
     */
    @objid ("42e9a39a-a315-4dac-87da-23d83ec5e76a")
    public static HwSensorLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorLink.STEREOTYPE_NAME);
        return HwSensorLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorLink} proxy from a {@link Link} stereotyped << HwSensor_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwSensorLink} proxy or <i>null</i>.
     */
    @objid ("445af3ae-37b7-4936-82f3-0895901e7437")
    public static HwSensorLink instantiate(final Link obj) {
        return HwSensorLink.canInstantiate(obj) ? new HwSensorLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorLink} proxy from a {@link Link} stereotyped << HwSensor_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwSensorLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c9a94f0e-54cf-4490-83f3-5763637a120e")
    public static HwSensorLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwSensorLink.canInstantiate(obj))
        	return new HwSensorLink(obj);
        else
        	throw new IllegalArgumentException("HwSensorLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1f579c1e-e8ad-4610-b87a-3a3e855a5b87")
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
        HwSensorLink other = (HwSensorLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("fb4d51d8-ae53-4175-8c19-aad670510cfc")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    @objid ("20b84dcb-9c91-4ec9-bdc3-6b54efc2a12b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("27d01d6e-5a83-4122-99aa-fe706c8b2b94")
    protected HwSensorLink(final Link elt) {
        super(elt);
    }

    @objid ("34013a74-d23b-4b11-9b43-a92ac86aa766")
    public static final class MdaTypes {
        @objid ("3a5f6a1b-fdf8-479b-974f-d234e54addd2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("370b754c-88e2-43ae-a8c1-6f21291f89a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("0f318729-c032-486e-86db-8f283688bf4a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1c64d434-f248-4837-a725-04959ba6cedd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e89de84e-c7ac-11df-ad39-001302895b2b");
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
