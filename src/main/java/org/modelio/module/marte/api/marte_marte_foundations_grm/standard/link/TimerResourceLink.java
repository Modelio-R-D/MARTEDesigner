/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link;

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
 * Proxy class to handle a {@link Link} with << TimerResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("25a85735-5322-4b55-a0ae-533a4f932d80")
public class TimerResourceLink extends TimingResourceLink {
    @objid ("5aa22cae-bc71-405b-8534-98822d7da239")
    public static final String STEREOTYPE_NAME = "TimerResource_Link";

    @objid ("851f04e3-a067-4078-aee9-05f4457e7ec6")
    public static final String TIMERRESOURCE_LINK_DURATION_TAGTYPE = "TimerResource_Link_duration";

    @objid ("c9f93571-f685-4c3e-870e-83929990c387")
    public static final String TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE = "TimerResource_Link_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << TimerResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2a6628aa-d1e0-41a9-87ae-e08025fdfefb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << TimerResource_Link >> then instantiate a {@link TimerResourceLink} proxy.
     * 
     * @return a {@link TimerResourceLink} proxy on the created {@link Link}.
     */
    @objid ("96ca51b7-5a69-4788-b489-18345fba4111")
    public static TimerResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLink.STEREOTYPE_NAME);
        return TimerResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceLink} proxy from a {@link Link} stereotyped << TimerResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link TimerResourceLink} proxy or <i>null</i>.
     */
    @objid ("09c14653-2326-4e4c-bdfe-4980264d54aa")
    public static TimerResourceLink instantiate(final Link obj) {
        return TimerResourceLink.canInstantiate(obj) ? new TimerResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceLink} proxy from a {@link Link} stereotyped << TimerResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link TimerResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5a8b02be-8a89-46d2-8ad4-bce3a30bd37f")
    public static TimerResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (TimerResourceLink.canInstantiate(obj))
        	return new TimerResourceLink(obj);
        else
        	throw new IllegalArgumentException("TimerResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd5b753b-d6fd-43e5-b701-7ce7057ec5d2")
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
        TimerResourceLink other = (TimerResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("68f17797-12fb-44b9-8027-d231581d50bf")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Link_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("62868483-6bde-42b5-aa9b-89e2c2912099")
    public String getTimerResource_Link_duration() {
        return this.elt.getTagValue(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT);
    }

    @objid ("99b4a517-3c8e-42f9-a38d-64fc093da7fc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Link_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("151f1c8a-9aa8-4bb1-b932-2c745a3d7060")
    public boolean isTimerResource_Link_isPeriodic() {
        return this.elt.isTagged(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Link_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6142cc62-0771-420b-bd97-b3301922fc68")
    public void setTimerResource_Link_duration(final String value) {
        this.elt.putTagValue(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Link_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3ea63af-bf97-43b7-95ec-633a2d526027")
    public void setTimerResource_Link_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceLink.MdaTypes.TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("31b1574a-6169-491d-ab42-8848afa0ee39")
    protected TimerResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("c0de845e-999c-4d4f-b0c7-3c0a20eafaf0")
    public static final class MdaTypes {
        @objid ("df7601cf-76e8-4c56-b9ec-2772fde36152")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("49ead36c-aa6a-4d12-8607-998fcf9d3f5b")
        public static TagType TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT;

        @objid ("db384faf-24ce-4845-b57d-919af124887f")
        public static TagType TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT;

        @objid ("b5a5d26c-758a-4ad2-b620-ad2a539c9f90")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ec7a18f-d230-4f5b-8e45-978738761358")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6da72561-d10c-4f22-924f-c3328135cfbe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc8-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_LINK_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abcf-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_LINK_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd6-0ccf-11df-8525-001302895b2b");
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
